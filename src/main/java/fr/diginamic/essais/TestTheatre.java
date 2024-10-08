package fr.diginamic.essais;

import fr.diginamic.Theatre;

public class TestTheatre {
    public static void main(String[] args) {


        Theatre resultat = new Theatre("Legrand", 560);
        resultat.inscrire(1550, 12.5);
        resultat.inscrire(1550, 12.5);

        System.out.println(resultat);
    }
}
