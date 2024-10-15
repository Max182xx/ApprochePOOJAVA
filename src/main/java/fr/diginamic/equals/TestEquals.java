package fr.diginamic.equals;

import fr.diginamic.Ville;

//TP18 APPRENDRE A REDEFINIR EQUALS
public class TestEquals {
    public static void main(String[] args) {

        Ville v1 = new Ville("Nice", 343000);
        Ville v2 = new Ville("Nice", 343000);
        System.out.println(v1.equals(v2));

        Ville v3 = new Ville("Nice", 343000);
        System.out.println(v1.equals(v3));

        Ville v4 = new Ville("Nice", 343000);
        System.out.println(v1.equals(v4));

        Ville v5 = v1;
        System.out.println(v1.equals(v5));

    }
}
