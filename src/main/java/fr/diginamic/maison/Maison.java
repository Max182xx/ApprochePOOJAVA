package fr.diginamic.maison;

import java.util.ArrayList;

public class Maison {
    private ArrayList<Piece> pieces;

    public Maison() {
        this.pieces = new ArrayList<>();
    }

    //Méthode pour ajouter un pièce
    public void ajouterPiece(Piece piece) {
        if (piece != null && piece.superficie > 0 && piece.nmrEtage >= 0) {
            pieces.add(piece);
        } else {
            System.out.println("Erreur : la pièce est invalide.");
        }
    }

    // Méthode pour calculer la superficie globale d'un type de pièce
    public double superficieGlobaleType(Class<? extends Piece> typePiece) {
        double superficieTotale = 0;
        for (Piece piece : pieces) {
            if (typePiece.isInstance(piece)) {
                superficieTotale += piece.getSuperficie();
            }
        }
        return superficieTotale;
    }

    // Méthode pour calculer le nombre de pièces d'un type donné
    public int nombreDePieces(Class<? extends Piece> typePiece) {
        int count = 0;
        for (Piece piece : pieces) {
            if (typePiece.isInstance(piece)) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Piece> getPieces() {
        return pieces;
    }
}
