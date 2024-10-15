package fr.diginamic.equals;

import fr.diginamic.Ville;

//TP18 APPRENDRE A REDEFINIR EQUALS
public class TestEquals {
    public static void main(String[] args) {

        Ville v1 = new Ville("Nice",  343000);
        Ville v2 = new Ville("Nice", 343000);



        boolean result = v1.equals(v2);
        System.out.println("Le resulat avec equals : " + result);

        boolean reulst1 = v1 == v2;
        System.out.println("Le resulat avec == : " + reulst1);

    }
}
