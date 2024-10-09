package listes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestListeString {
    public static void main(String[] args) {

        List<String> liste1 = new ArrayList<>();
        liste1.addAll(Arrays.asList("Nice", "Carcassonne", "Narbonne", "Lyon", "Foix", "Pau", "Marseille", "Tarbes"));

        String plusGrandMot = "";
        for (String mot : liste1) {
            if (mot.length() > plusGrandMot.length()) {
                plusGrandMot = mot;
            }
        }

        for (int i = 0; i < liste1.size(); i++) {
            liste1.set(i, liste1.get(i).toUpperCase());
        }

        Iterator<String> iterator = liste1.iterator();
        while (iterator.hasNext()) {
            String mot = iterator.next();
            if (mot.toLowerCase().startsWith("n")) {
                iterator.remove();
            }
        }

        System.out.println(liste1);
        System.out.println(plusGrandMot);
    }
}
