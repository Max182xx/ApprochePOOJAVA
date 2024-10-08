package fr.diginamic.operations;

//Exercice Operations
//• Créez un package fr.diginamic.operations OK
//• Dans ce package créez une classe Operations OK
//o cette classe a une méthode de classe calcul qui prend en paramètre 2 double a
//et b et un opérateur qui est de type char. ok
//o Si l’opérateur vaut ‘+’ alors la méthode calcul retourne a+b
//o Si l’opérateur vaut ‘-‘ alors la méthode calcul retourne a-b
//o Faites la même chose pour les opérateurs *et /
//• Creez un package fr.diginamic.essais
//• Dans ce package, creez une classe TestOperations qui permet de tester les 4
//opérations

public class Operations {

    public double calcul(double a, double b, char c){
        switch (c){
            case '+' :
              return a +b;

            case '-' :
              return a -b;

            case '*' :
              return a *b;

            case '/' :
              return a / b;
        }
        return c;
    }

}
