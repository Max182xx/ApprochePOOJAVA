package fr.diginamic.salaire;

// J1 Terminé Exercice CalculSalaire

public class Pigiste extends Intervenant {

    private int journeeTrav;
    private double remuneration;

    public Pigiste(String nom, String prenom, int journeeTrav, double remuneration) {
        super(nom, prenom);
        this.journeeTrav = journeeTrav;
        this.remuneration = remuneration;
    }

    @Override
    public double getSalaire() {
        return journeeTrav * remuneration;
    }

    @Override
    public String getStatut() {
        return "Pigiste";
    }

    public int getJourneeTrav() {
        return journeeTrav;
    }

    public void setJourneeTrav(int journeeTrav) {
        this.journeeTrav = journeeTrav;
    }

    public double getRemuneration() {
        return remuneration;
    }

    public void setRemuneration(double remuneration) {
        this.remuneration = remuneration;
    }


}
