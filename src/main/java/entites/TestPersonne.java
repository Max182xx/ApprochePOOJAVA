package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne id = new Personne( "Garcia",  "Maxime");

        Personne id2 = new Personne("Dupont", "Alain", new AdressePostale("3B","Impasse du square", 3160, "Castries"));

        id.appelle();
        id.modifNom("Dupont");
        id.modifPrenom("Antoine");
        id.modifAdresse( new AdressePostale("1", "bababa", 20000, "rerere") );
        id.appelle();
    }

}
