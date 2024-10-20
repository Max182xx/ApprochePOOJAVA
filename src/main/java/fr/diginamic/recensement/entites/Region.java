package fr.diginamic.recensement.entites;

public class Region {

    private int codeRegion; // code de la région
    private String nomRegion; // nom de la région

    //Constructeurs de la classe avec soit codeRegion ou nomRegion en paramètre ou les deux

    public Region(String nomRegion) {
        this.nomRegion = nomRegion;
    }

    public Region(int codeRegion) {
        this.codeRegion = codeRegion;
    }

    public Region(Integer codeRegion, String nomRegion) {
        this.codeRegion = codeRegion;
        this.nomRegion = nomRegion;
    }

    //Getters

    public int getCodeRegion() {
        return codeRegion;
    }

    public String getNomRegion() {
        return nomRegion;
    }

    @Override
    public String toString() {
        return codeRegion + nomRegion;
    }
}

