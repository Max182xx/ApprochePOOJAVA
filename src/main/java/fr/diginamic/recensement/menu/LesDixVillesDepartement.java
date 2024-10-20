package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.comparer.ComparerHabitants;
import fr.diginamic.recensement.entites.Departement;
import fr.diginamic.recensement.entites.Recensement;

import java.util.*;

public class LesDixVillesDepartement {

    public LesDixVillesDepartement() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {
        scanner = new Scanner(System.in);
        System.out.println("\nAffichage des 10 villes les plus peuplées d'un département, saisir le numéro du département !\n");
        String v = scanner.nextLine();

        // Regex pour exclure les lettres
        if (!v.matches("\\d+")) {
            System.out.println("Erreur: La saisie \"" + v + "\" n'est pas un numéro de département valide. Veuillez entrer uniquement des chiffres.");
            return;  // On arrête l'exécution si la saisie n'est pas valide
        }

        // Liste des numéros de départements valides
        Set<String> numerosDepartementsValides = new HashSet<>();
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            numerosDepartementsValides.add(recensement.getMesCommunes().get(i).getDpt().getDepartement());
        }

        if (!numerosDepartementsValides.contains(v)) {
            System.out.println("Erreur: Le numéro de département " + v + " est inconnu.");
            return;  // On arrête l'exécution si le département est inconnu
        }

        Departement d = new Departement(v);
        System.out.println("Vous avez saisi le département " + d.getDepartement() + "\n");

        HashMap<String, Integer> villesDepartement = new HashMap<>();
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement, i, villesDepartement, d);
        }

        triMap(villesDepartement);
    }

    /**
     * <p>Méthode de regroupement du nombre d'habitants par région.</p>
     * <p>Si le nom de la région interrogée existe dans la map, on ajoute le nombre d'habitants
     * à la valeur actuelle. Ensuite, on met à jour la valeur avec le nouveau total d'habitants.</p>
     * <b>Le nom de la région est remplacé, bien qu'il ne soit pas modifié.</b>
     *
     * <p>Si la région n'est pas connue, on ajoute la paire clé-valeur dans la map.</p>
     *
     * @param r Le recensement contenant les données démographiques.
     * @param c Le compteur utilisé pour parcourir les communes.
     * @param rp La HashMap contenant le nom de la région et le nombre d'habitants.
     * @param d Le département associé à la commune.
     */
    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp, Departement d) {
        String cdDepartement = d.getDepartement();
        String nomVille = r.getMesCommunes().get(c).getNomCommune();

        // Vérifie si le code du département correspond au département de la commune
        if (cdDepartement.equals(r.getMesCommunes().get(c).getDpt().getDepartement())) {
            // Ajoute la ville et sa population à la HashMap
            rp.put(nomVille, r.getMesCommunes().get(c).getPopTotale());
        }
    }

    /**
     * <p>Cette méthode permet de trier la map et d'afficher son contenu.</p>
     * <p>Les valeurs de la HashMap passée en paramètre sont triées en utilisant la classe de comparaison {@link ComparerHabitants}.</p>
     * <p>Les valeurs triées sont ensuite placées dans un TreeMap pour un rangement simplifié.</p>
     * <p>Nous utilisons un objet Set et un Iterator pour récupérer les entrées du TreeMap.</p>
     * <p>L'objectif est d'afficher les 10 premières villes les plus peuplées (correspondant aux 10 premières entrées du TreeMap).</p>
     * <p>À chaque itération, un objet Map.Entry est créé pour récupérer le couple clé-valeur de chaque élément,
     * ce qui permet de formater et afficher les résultats sous la forme "Clé - Valeur", en utilisant les méthodes getKey() et getValue().</p>
     *
     * @param rp HashMap contenant les villes et leurs populations.
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
