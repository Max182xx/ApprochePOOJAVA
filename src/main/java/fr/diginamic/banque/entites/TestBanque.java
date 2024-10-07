package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {


        Compte infos = new Compte ("B12555", 26565);
        CompteTaux taux = new CompteTaux(0.2, "22", 22);

        String numeroDeCompte = infos.getNumero();
        float soldeDuCompte = infos.getSolde();
        double tauxDuCompte = taux.getRate();

        System.out.println(taux);

    }

}
