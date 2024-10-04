package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne id = new Personne();
        id.nom = "Garcia";
        id.prenom = "Maxime";
        id.adresse = new AdressePostale();

        Personne id2 = new Personne();
        id2.nom = "Garcia";
        id2.prenom = "Maxime";
        id2.adresse = new AdressePostale();
        id2.adresse.numeroRue = "3";
        id2.adresse.numeroRue ="lalala";
        id2.adresse.ville = "bababa";
        id2.adresse.codePostal = 34000;
    }
}
