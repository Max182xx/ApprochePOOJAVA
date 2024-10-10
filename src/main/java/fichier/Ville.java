package fichier;

public class Ville {
    String nom;
    String codePostale;
    String nomDeLaRegion;
    int populationTotale;


    public Ville(String nom, String codePostale, String nomDeLaRegion, int population) {
        this.nom= nom;
        this.codePostale = codePostale;
        this.nomDeLaRegion = nomDeLaRegion;
        this.populationTotale = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostale() {
        return codePostale;
    }

    public void setCodePostale(String codePostale) {
        this.codePostale = codePostale;
    }

    public String getNomDeLaRegion() {
        return nomDeLaRegion;
    }

    public void setNomDeLaRegion(String nomDeLaRegion) {
        this.nomDeLaRegion = nomDeLaRegion;
    }

    public int getPopulationTotale() {
        return populationTotale;
    }

    public void setPopulationTotale(int populationTotale) {
        this.populationTotale = populationTotale;
    }

}

