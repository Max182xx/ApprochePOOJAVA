package entites;

public class Personne {
    String nom;
    String prenom;
    AdressePostale adresse;

    Personne(String nom, String prenom){
        this.nom = nom;
        this.prenom = prenom;
    }
    Personne(String nom, String prenom, AdressePostale adresse){
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
    }

}
