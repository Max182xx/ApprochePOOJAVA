package fr.diginamic.chaines;

// TP16 STRINGBUILDER
public class TestStringBuilder {

    public static void main(String[] args) {
        // Chronomètre début
        long startTime = System.nanoTime();

        // Création d'une instance de StringBuilder
        StringBuilder builder = new StringBuilder();

        // Ajout des nombres de 1 à 100 000 dans le StringBuilder
        for (int i = 1; i <= 100000; i++) {
            builder.append(i);
        }

        // Chronomètre fin
        long endTime = System.nanoTime();

        // Calcul du temps écoulé
        long timeElapsed = endTime - startTime;
        double timeInMilliseconds = timeElapsed / 1_000_000.0;

        // Affichage du temps écoulé
        System.out.println("Temps écoulé : " + timeInMilliseconds + " millisecondes");
    }
}
