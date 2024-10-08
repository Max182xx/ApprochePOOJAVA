package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {
    public static void main(String[] args) {

        CalculMoyenne resultat = new CalculMoyenne();
        resultat.ajoutNote(15);
        resultat.ajoutNote(17.5);
        resultat.ajoutNote(15);
        resultat.ajoutNote(11);

        System.out.println("Ma moyenne est de " + resultat.calcul());
    }

}
