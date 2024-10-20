package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.comparer.ComparerHabitants;
import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Region;

import java.util.HashMap;
import java.util.*;

public class LesDixVillesRegions {

    public LesDixVillesRegions() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.println("\nAffichage des 10 villes les plus peuplées d'une région, saisir le numéro de région !\n");

        String input = scanner.nextLine();

        // Vérification pour exclure les lettres (Regex) et capturer une saisie non numérique
        if (!input.matches("\\d+")) {
            System.out.println("Erreur: La saisie \"" + input + "\" n'est pas un numéro de région valide. Veuillez entrer uniquement des chiffres.");
            return;  // On arrête l'exécution si la saisie n'est pas valide
        }

        int v = Integer.parseInt(input); // Conversion de l'entrée en entier après vérification

        // Vérifier si le numéro de région existe dans le recensement
        boolean regionExiste = false;
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            if (recensement.getMesCommunes().get(i).getCodeR().getCodeRegion() == v) {
                regionExiste = true;
                break;
            }
        }

        if (!regionExiste) {
            System.out.println("Erreur: Le numéro de région " + v + " est inconnu.");
            return; // Arrêter l'exécution si la région n'existe pas
        }

        // Création de la région
        Region d = new Region(v);
        HashMap<String, Integer> villesRegion = new HashMap<>();

        // Ajout des villes correspondant à la région
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement, i, villesRegion, d);
        }

        // Trier la MAP par clé-valeur et afficher
        triMap(villesRegion);
    }

    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp, Region re) {
        String nomVille = r.getMesCommunes().get(c).getNomCommune();
        if (re.getCodeRegion() == r.getMesCommunes().get(c).getCodeR().getCodeRegion()) {
            rp.put(nomVille, r.getMesCommunes().get(c).getPopTotale());
        }
    }

    void triMap(HashMap<String, Integer> rp) {
        ComparerHabitants comparerHabitants = new ComparerHabitants(rp);
        TreeMap<String, Integer> maptri = new TreeMap<>(comparerHabitants);
        maptri.putAll(rp);
        final int COMPTEUR = 10;
        Set set = maptri.entrySet();
        Iterator i = set.iterator();
        int j = 1;
        while (i.hasNext() && (j <= COMPTEUR)) {
            Map.Entry m = (Map.Entry) i.next();
            System.out.println(j + ") " + m.getKey() + " | " + m.getValue() + " habitants");
            j++;
        }
    }
}
