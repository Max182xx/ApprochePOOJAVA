package fr.diginamic.essais;


import fr.diginamic.operations.Operations;

public class TestOperations {
    public static void main(String[] args) {

       Operations test = new Operations();
       double addition = test.calcul(15,15, '+');
       double soustraction = test.calcul(20,20, '-');
       double multiplication = test.calcul(2,2,'*');
       double division = test.calcul(10,50, '/');

        System.out.println(addition);
        System.out.println(soustraction);
        System.out.println(multiplication);
        System.out.println(division);
    }

}
