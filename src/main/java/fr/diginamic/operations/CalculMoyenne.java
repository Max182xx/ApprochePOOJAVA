package fr.diginamic.operations;

//Exercice CalculMoyenne
//• Dans le package fr.diginamic.operations créez une classe CalculMoyenne OKKKKK
//o Cette classe a un attribut d’instance de type tableau de double.
//o Cette classe a également une méthode ajout qui permet d’ajouter un double
//au tableau. Vous aurez besoin de gérer l’agrandissement du tableau. OKKKKKK
//o Enfin cette classe a une méthode calcul qui ne prend pas de paramètre et
//retourne la moyenne des éléments du tableau.
//• Dans le package fr.diginamic.essais, créez une classe TestMoyenne OK
//o Vérifiez que votre classe CalculMoyenne fonctionne correctement en
//effectuant au moins 2 tests différents.
//• PRECISION : c’est une bonne pratique d’avoir le réflexe de faire des classes utilitaires
//de ce type.

import java.util.ArrayList;

public class CalculMoyenne {

    ArrayList<Double> noteArray = new ArrayList<>();

    public void ajoutNote(double note) {
        this.noteArray.add(note);
    }

    public double calcul() {
        double moyenne = 0;
        for (int i = 0; i < this.noteArray.size(); i++) {
            moyenne += this.noteArray.get(i);
        }

        moyenne = moyenne / this.noteArray.size();
        return moyenne;
    }
}

