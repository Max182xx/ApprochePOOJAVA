package fr.diginamic.banque.entites;

public class TestBanque {
    public static void main(String[] args) {



        CompteTaux[] tabCompte = new CompteTaux[2];

        tabCompte[0]= new CompteTaux(0.2, "B158", 1582);
        tabCompte[1]= new CompteTaux(0., "B152588", 125582);

        for (int i= 0; i< tabCompte.length; i++){
            System.out.println(tabCompte[i]);
        }

    }

}
