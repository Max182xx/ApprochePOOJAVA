package fr.diginamic.banque.entites;

public class Compte {

   private String numero;
   private float solde;

Compte( String numero, float solde){
    this.solde = solde;
    this.numero = numero;
}
    @Override
    public String toString() {
        return numero +" "+ solde;
    }

    public String getNumero(){
        return numero;
    }
    public float getSolde(){
        return solde;
    }
}
