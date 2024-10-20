package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.comparer.ComparerHabitants;
import fr.diginamic.recensement.entites.Recensement;

import java.util.*;

public class LesDixRegionsPlusPeuplees extends MenuService {

    // Constructeur
    public LesDixRegionsPlusPeuplees() {
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("\nAffichage des 10 régions les plus peuplées !\n");

        HashMap<String, Integer> regionPeuplees = new HashMap<>();

        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement, i, regionPeuplees);
        }
        // Trier la MAP par clé valeur
        triMap(regionPeuplees);

    }

    /**
     * <p>Méthode de regroupement du nombre d'habitants par région.</p>
     * <p>Si le nom de la région interrogée existe dans la map, on ajoute le nombre d'habitants
     * interrogé à celui de la valeur clé actuelle, puis on remplace le nombre d'habitants dans la valeur.</p>
     * <b>Le nom de région est remplacé bien qu'il ne soit pas modifié.</b>
     *
     * <p>Dans le cas contraire, si la région n'est pas connue, on ajoute la valeur clé-valeur dans la map.</p>
     *
     * @param r  Le recensement contenant les communes.
     * @param c  L'index de la commune dans le recensement.
     * @param rp La HashMap contenant les noms de région et leur nombre d'habitants.
     */
    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp) {
        String nomDeRegion = r.getMesCommunes().get(c).getCodeR().getNomRegion();
        boolean siExiste = rp.containsKey(nomDeRegion);
        int nombreHab;

        if (siExiste) { // Vérifie si la région existe déjà dans la map
            nombreHab = r.getMesCommunes().get(c).getPopTotale() + rp.get(nomDeRegion);
            rp.replace(nomDeRegion, nombreHab); // Met à jour le nombre d'habitants pour la région existante
        } else {
            rp.put(nomDeRegion, r.getMesCommunes().get(c).getPopTotale()); // Ajoute une nouvelle région à la map
        }
    }

    /**
     * <p>Cette méthode permet de trier la map et d'afficher le contenu.</p>
     * <p>Les valeurs de la HashMap passée en paramètre sont affectées à notre classe de tri ({@link ComparerHabitants}).</p>
     * <p>Ces valeurs <b>triées</b> sont ensuite affectées à un TreeMap (le rangement dans ce map est simplifié).</p>
     * <p>On utilise des objets Set et Iterator pour récupérer les entrées du TreeMap.</p>
     * <p>On souhaite afficher les 10 régions les plus peuplées (les 10 premières entrées du TreeMap).</p>
     * <p>Pour chaque valeur, on crée un MAP.Entry pour récupérer le couple clé-valeur d'un élément du TreeMap,
     * ce qui nous permet d'afficher la clé et la valeur formatées comme suit : Clé - Valeur
     * en utilisant les méthodes getKey() et getValue().</p>
     *
     * @param rp La HashMap contenant les noms de région et leur nombre d'habitants.
     */
    void triMap(HashMap<String, Integer> rp) {
        // Tri des valeurs dans l'ordre croissant
        ComparerHabitants comparerHabitants = new ComparerHabitants(rp);
        TreeMap<String, Integer> maptri = new TreeMap<>(comparerHabitants); // Création du TreeMap trié
        maptri.putAll(rp); // Ajout des valeurs de la HashMap dans le TreeMap

        final int COMPTEUR = 10; // Limite du nombre d'entrées à afficher
        Set<Map.Entry<String, Integer>> set = maptri.entrySet(); // Récupération des entrées du TreeMap
        Iterator<Map.Entry<String, Integer>> i = set.iterator(); // Création de l'itérateur
        int j = 1; // Compteur pour l'affichage des régions

        // Boucle pour afficher les 10 régions les plus peuplées
        while (i.hasNext() && (j <= COMPTEUR)) {
            Map.Entry<String, Integer> m = i.next(); // Récupération de la valeur suivante
            System.out.println(j + ") " + m.getKey() + " | " + m.getValue() + " habitants"); // Affichage de la région et de sa population
            j++; // Incrémentation du compteur
        }
    }

}
