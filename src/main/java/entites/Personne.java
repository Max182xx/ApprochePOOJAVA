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
    public void appelle (){
        System.out.println(this.nom.toUpperCase() + " " + this.prenom.toUpperCase() + " " + this.adresse);
    }
    public void modifNom(String nom){
        this.nom = nom;
    }
    public void modifPrenom(String prenom){
        this.prenom = prenom;
    }
    public void modifAdresse( AdressePostale adr1 ){
        this.adresse = adr1;
    }
}
