package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.comparer.ComparerHabitants;
import fr.diginamic.recensement.entites.Recensement;

import java.util.*;

public class DixVillesDeFrance {

    public DixVillesDeFrance() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {

        System.out.println("\nAffichage des 10 villes les plus peuplées de France !\n");
        HashMap<String, Integer> villesFrance = new HashMap<>();
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            Ajouter(recensement, i, villesFrance);
        }
        // Trier la MAP par clé valeur
        //System.out.println(villesDepartement);
        triMap(villesFrance);

    }

    /**
     * Méthode de regroupement du nombre d'habitants par région.
     * Si le nom de la région interrogée existe déjà dans la map, on additionne le nombre d'habitants fourni à la valeur actuelle associée à cette clé,
     * puis on met à jour la valeur avec le nouveau total d'habitants.
     * <b>Le nom de la région est conservé dans la map, même s'il n'est pas modifié.</b>
     * <p>
     * En revanche, si la région n'est pas reconnue, on ajoute une nouvelle paire clé-valeur dans la map.
     *
     * @param r  // recensement
     * @param c  // compteur
     * @param rp // HashMap "Nom de la région, nombre d'habitants"
     */

    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp) {
        // Récupère le nom de la ville à partir de l'objet Recensement et de l'index fourni
        String nomVille = r.getMesCommunes().get(c).getNomCommune();

        // Ajoute la ville et sa population totale dans la HashMap
        // La clé est le nom de la ville et la valeur est sa population totale
        rp.put(nomVille, r.getMesCommunes().get(c).getPopTotale());
    }

    /**
     * <p>Cette méthode permet de trier la map et d'afficher son contenu.</p>
     * <p>Les valeurs du HashMap passé en paramètre sont affectées à notre classe de tri ({@link ComparerHabitants}).</p>
     * <p>Ensuite, ces valeurs <b>triées</b> sont stockées dans un TreeMap, qui simplifie l'organisation des éléments.</p>
     * <p>Nous utilisons des objets Set et Iterator pour récupérer les clés du TreeMap.</p>
     * <p>Notre objectif est d'afficher uniquement les 10 régions les plus peuplées (c'est-à-dire les 10 premières entrées du TreeMap).</p>
     * <p>Nous bouclons ensuite, en créant un MAP.Entry pour chaque valeur, ce qui nous permet de récupérer le couple clé-valeur d'un
     * élément du TreeMap. Cela nous permet de formater l'affichage sous la forme Clé - Valeur
     * en utilisant les méthodes getKey() et getValue().</p>
     *
     * @param rp Le HashMap contenant les données à trier.
     */

    void triMap(HashMap<String, Integer> rp) {
        // Tri des vvaleurs dans l'ordre croissant
        ComparerHabitants comparerHabitants = new ComparerHabitants(rp);
        TreeMap<String, Integer> maptri = new TreeMap<>(comparerHabitants); //affectation des valeurs
        maptri.putAll(rp);//Affectation des valeurs de rp triées, dans
        final int COMPTEUR = 10;
        Set set = maptri.entrySet(); // récuprère la liste des clés
        Iterator i = set.iterator(); // Itération
        int j = 1;
        while (i.hasNext() && (j <= COMPTEUR)) { // Tant qu'il reste des clés à traiter et que j est inférieur ou égal à COMPTEUR, on continue la boucle
            Map.Entry m = (Map.Entry) i.next(); // Récupère l'entrée suivante de la collection
            System.out.println(+j + ") " + m.getKey() + "|" + m.getValue() + " habitants");
            j++; // Incrémente le compteur j pour passer à la prochaine entrée
        }
    }
}
