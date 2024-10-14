package fr.diginamic.salaire;

// J1 Terminé Exercice CalculSalaire

public abstract class Intervenant {

    private String nom;
    private String prenom;
    private String statut;

    public Intervenant(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
    }

    public void afficherDonnees() {
        System.out.println("Nom : " + nom);
        System.out.println("Prénom : " + prenom);
        System.out.println("Salaire : " + getSalaire());
        System.out.println("Statut : " + getStatut());
    }


    public abstract double getSalaire();


    public String getStatut() {
        return statut;
    }

    public void setStatut(String statut) {
        this.statut = statut;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

}
