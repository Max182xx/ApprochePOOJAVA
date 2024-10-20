package fr.diginamic.essais;

import fr.diginamic.maison.*;

// J1 Exercice Immobilier
public class TestMaison {
    public static void main(String[] args) {

        Maison maison = new Maison();

        maison.ajouterPiece(new Chambre(11,2));
        maison.ajouterPiece(new Chambre(17,1));
        maison.ajouterPiece(new Cuisine(20, 1));
        maison.ajouterPiece(new WC(5, 0));
        maison.ajouterPiece(new Salon(30,0));
        maison.ajouterPiece(new SalleDeBain(15,1));

        // Test le null
        maison.ajouterPiece(null);

        System.out.println("La superficie totale des chambres dans la maison est de : " +maison.superficieGlobaleType( Chambre.class) + "m²");
        System.out.println("Le nombre totale des chambres dans la maison est de :" +maison.nombreDePieces(Chambre.class));
    }
}
