package fr.diginamic.banque.entites;

public abstract class Operation {

    String date;
    String montant;

    Operation(String date, String montant){
        this.date = date;
        this.montant = montant;
    }
}

