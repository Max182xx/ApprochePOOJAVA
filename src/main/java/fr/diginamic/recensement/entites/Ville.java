package fr.diginamic.recensement.entites;

public class Ville {

    private Region codeR;
    private Departement dpt;
    private int codeCommune;
    private String nomCommune;
    private int popTotale;

    //constructeur

    public Ville(Region codeR, Departement dpt, Integer codeCommune, String nomCommune, Integer popTotale) {
        this.codeR = codeR;
        this.dpt = dpt;
        this.codeCommune = codeCommune;
        this.nomCommune = nomCommune;
        this.popTotale = popTotale;
    }

    //getters

    public Region getCodeR() {
        return codeR;
    }

    public Departement getDpt() {
        return dpt;
    }

    public int getCodeCommune() {
        return codeCommune;
    }

    public String getNomCommune() {
        return nomCommune;
    }

    public int getPopTotale() {
        return popTotale;
    }

    @Override
    public String toString() {
        return ("\nVille = " + codeR + " " + dpt + " " + codeCommune + " " + nomCommune + " " + popTotale);
    }
}

