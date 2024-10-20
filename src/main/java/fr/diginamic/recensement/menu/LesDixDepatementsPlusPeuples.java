package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.comparer.ComparerHabitants;
import fr.diginamic.recensement.entites.Recensement;

import java.util.*;

public class LesDixDepatementsPlusPeuples {

    //Constructeur
    public LesDixDepatementsPlusPeuples() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("\nAffichage des 10 départements les plus peuplées !\n");
        HashMap<String, Integer> departementPeuples = new HashMap<>();
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement, i, departementPeuples);
        }
        // Trier la MAP par clé valeur
        triMap(departementPeuples);

    }

    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp) {

        String nomDeDepartement = r.getMesCommunes().get(c).getDpt().toString();
        boolean siExiste = rp.containsKey(nomDeDepartement);
        int nombreHab;
        if (nomDeDepartement.equals(r.getMesCommunes().get(c).getDpt()) && siExiste) {
            nombreHab = r.getMesCommunes().get(c).getPopTotale() + rp.get(nomDeDepartement);
            rp.replace(nomDeDepartement, nombreHab);
        } else {
            rp.put(nomDeDepartement, r.getMesCommunes().get(c).getPopTotale());
        }

    }

    void triMap(HashMap<String, Integer> rp) {
        // Création d'un comparateur pour trier les valeurs en fonction du nombre d'habitants
        ComparerHabitants comparerHabitants = new ComparerHabitants(rp);
        // Création d'un TreeMap pour stocker les valeurs triées
        TreeMap<String, Integer> maptri = new TreeMap<>(comparerHabitants);
        // Ajout des valeurs de la HashMap rp dans le TreeMap
        maptri.putAll(rp);
        // Constante pour limiter le nombre d'entrées à afficher
        final int COMPTEUR = 10;
        // Récupération de l'ensemble des entrées du TreeMap (clé-valeur)
        Set<Map.Entry<String, Integer>> set = maptri.entrySet();
        // Création d'un itérateur pour parcourir les entrées
        Iterator<Map.Entry<String, Integer>> i = set.iterator();
        // Compteur pour afficher les dix premières entrées
        int j = 1;
        // Boucle pour afficher les 10 régions les plus peuplées
        while (i.hasNext() && (j <= COMPTEUR)) {
            Map.Entry<String, Integer> m = i.next(); // Récupération de la valeur suivante
            // Affichage de la position, de la clé (nom de la région) et de la valeur (nombre d'habitants)
            System.out.println(j + ") " + m.getKey() + " | " + m.getValue() + " habitants");
            j++; // Incrémentation du compteur
        }
    }

}

