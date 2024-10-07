package fr.diginamic.banque.entites;

public class CompteTaux extends Compte {

    private double rate;

    public CompteTaux(double rate, String numero, float solde){
        super(numero, solde);
        this.rate = rate;
    }

    public double getRate(){
        return this.rate;
    }

    @Override
    public String toString() {
        return super.toString() + rate;
    }
}

