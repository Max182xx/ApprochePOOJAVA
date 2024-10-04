package entites;

public class AdressePostale {
    String numeroRue;
    String libelleRue;
    int codePostal;
    String ville;

    AdressePostale(String numeroRue, String libelleRue, int codePostal, String ville ){
        this.numeroRue = numeroRue;
        this.libelleRue= libelleRue;
        this.codePostal = codePostal;
        this.ville = ville;

    }

}
