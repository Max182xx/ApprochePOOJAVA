package entites;

public class TestPersonne {
    public static void main(String[] args) {
        Personne id = new Personne( "Garcia",  "Maxime");


        Personne id2 = new Personne("Dupont", "Alain", new AdressePostale("3","Impasse du square", 3160, "Castries"));

    }
}
