package fr.diginamic.maison;

// J1 Exercice Immobilier
public class Piece {

    double superficie;
    short nmrEtage;

    public Piece(double superficie, short nmrEtage){
        this.superficie = superficie;
        this.nmrEtage = nmrEtage;
    }
    public Double getSuperficie() {
        return superficie;
    }

    public void setSuperficie(Double superficie) {
        this.superficie = superficie;
    }

    public short getNbrPiece() {
        return nmrEtage;
    }

    public void setNbrPiece(short nmrEtage) {
        this.nmrEtage = nmrEtage;
    }


}
