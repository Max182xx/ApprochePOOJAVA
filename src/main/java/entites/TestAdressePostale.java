package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adr1 = new AdressePostale("1", "ma rue", 24000, "Mon Q");
        /*adr1.numeroRue = "3B";
        adr1.libelleRue = "Impasse du square";
        adr1.codePostal = 34160;
        adr1.ville = "Castries";*/

        AdressePostale adr2 = new AdressePostale("1b", "pas ma rue", 34000, "ton Q");
        /*adr2.numeroRue = "4B";
        adr2.libelleRue = "Impasse du square";
        adr2.codePostal = 83500;
        adr2.ville = "La Seyne sur Mer";*/
    }
}
