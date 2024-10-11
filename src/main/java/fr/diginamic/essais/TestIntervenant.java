package fr.diginamic.essais;

import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salaire;

public class TestIntervenant {
    public static void main(String[] args) {

        Salaire salaire1 = new Salaire("Garcia","Maxime", 2500);
        System.out.println( " Le salaire de " + salaire1.getNom() +" "+ salaire1.getPrenom() +" "+ "est de :" + salaire1.getSalaire()+ "€") ;

        Pigiste salaire2 = new Pigiste("Dupont", "Antoine", 30, 3000);
        System.out.println("Le pigiste " + salaire2.getNom() + " "+ salaire2.getPrenom()+" à touché :"+ salaire2.getSalaire()+ "€");

        System.out.println("Données du salarié :");
        salaire1.afficherDonnees();

    }
}
