package listes;

import java.util.ArrayList;
import java.util.Collections;

public class TestVilles {
    public static void main(String[] args) {

        ArrayList<Ville> listeVilles = new ArrayList<>();
        Collections.addAll(listeVilles, new Ville("Nice", 343 000), new Ville("Carcassonne", 47 800),
                new Ville("Narbonne", 53 400), new Ville("Lyon", 484 000), new Ville("Foix", 9 700),
                new Ville("Pau", 77 200), new Ville("Marseille", 850 700), new Ville("Tarbes", 40 600));


    }
}
