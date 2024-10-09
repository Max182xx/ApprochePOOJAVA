package listes;

//Apprenez à manipuler une liste d’entiers
//• Dans le package listes, créez une classe TestListeInt exécutable.
//• Dans cette classe instanciez une ArrayList d’entiers et placez-y les éléments suivants :
//o -1, 5, 7, 3, -2, 4, 8, 5
//o Astuce : on ne peut pas créer une ArrayList de int car int est un type primitif. Il
//faut créer une ArrayList de Integer : ArrayList<Integer> liste = new ArrayList<>() ;
//• Affichez tous les éléments de la liste
//• Affichez la taille de la liste
//• Recherchez et affichez le plus grand élément de la liste
//• Supprimez le plus petit élément de la liste et affichez le résultat
//• Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils deviennent
//positifs.
//• Affichez enfin la liste résultante

import java.util.*;

public class TestListeInt {
    public static void main(String[] args) {

        List<Integer> liste1 = new ArrayList<>();
        liste1.addAll(Arrays.asList(-1, 5, 7, 3, -2, 4, 9, 5));
        int nombreMax = Collections.max(liste1);
        int nombreMin = Collections.min(liste1);

        Iterator<Integer> iter = liste1.iterator();

        /*while (iter.hasNext()) {
            Integer list = iter.next();
            if (list.equals(nombreMin)) {
                iter.remove();
            }*/

            //• Recherchez tous les éléments négatifs et modifiez-les de manière à ce qu’ils
            // deviennent positifs.

            for (int i = 0; i < liste1.size(); i++) {
                if (liste1.get(i) < 0 ) {
                    liste1.set(i , Math.abs(liste1.get(i)));
                }
            }
            System.out.println(liste1);
            System.out.println(liste1.size());
            System.out.println(nombreMax);

        }
    }
