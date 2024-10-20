package fr.diginamic.recensement.entites;

public class Departement {

    private String departement;

    //constructeur

    public Departement(String departement) {
        this.departement = departement;
    }

    //getter

    public String getDepartement() {

        return departement;
    }

    @Override
    public String toString() {
        return departement;
    }
}

