package fr.diginamic.maison;

// J1 Exercice Immobilier
public class Piece {

    double superficie;
    int nmrEtage;

    public Piece(double superficie, int nmrEtage){
        this.superficie = superficie;
        this.nmrEtage = nmrEtage;
    }
    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public int getNbrPiece() {
        return nmrEtage;
    }

    public void setNbrPiece(int nmrEtage) {
        this.nmrEtage = nmrEtage;
    }


}
