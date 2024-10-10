package maps;

import java.util.HashMap;

public class mapVilles {



        public static void main(String args[]) {
            HashMap<Integer, String> mapVilles = new HashMap<>();
            mapVilles.put(13, "Marseille");
            mapVilles.put(34, "Montpellier");
            mapVilles.put(44, "Nantes");
            mapVilles.put(75, "Paris");
            mapVilles.put(31, "Toulouse");

            mapVilles.put(59,"Lille");
            mapVilles.put(69, "Lyon");
            mapVilles.put(33,"Bordeaux");

            for (int key : mapVilles.keySet()){
                System.out.println(key);
            }

            for (int valeur : mapVilles.keySet() ){
                System.out.println(mapVilles.get(valeur));
            }

            System.out.println(mapVilles.size());
        }
    }


