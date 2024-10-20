package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.entites.Region;

import java.util.Scanner;

public class RechercheRegion {

    // Constructeur
    public RechercheRegion() {
    }

    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("De quelle région voulez-vous connaître la population totale ? (Veuillez entrer le numéro de la région)");

        scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Lecture de l'entrée utilisateur

        // Vérification si la saisie contient des lettres ou est vide
        if (!input.matches("\\d+") || input.isEmpty()) {
            System.out.println("Erreur : La saisie \"" + input + "\" n'est pas un code de région valide. Veuillez entrer uniquement des chiffres.");
            return;  // On arrête l'exécution si la saisie contient des lettres ou est vide
        }

        // Conversion de la saisie en entier
        int codeRegion = Integer.parseInt(input);
        String nomR = "";
        int poptotal = 0;
        boolean trouve = false; // Indique si la région a été trouvée

        Region r = new Region(codeRegion);

        // Boucle pour calculer la population totale de la région
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            if (r.getCodeRegion() == recensement.getMesCommunes().get(i).getCodeR().getCodeRegion()) {
                poptotal += recensement.getMesCommunes().get(i).getPopTotale();
                nomR = recensement.getMesCommunes().get(i).getCodeR().getNomRegion();
                trouve = true; // La région a été trouvée
            }
        }

        // Vérification si la région a été trouvée ou non
        if (!trouve) {
            System.out.println("Erreur : Le code de région " + codeRegion + " est inconnu.");
        } else {
            System.out.println("La population totale de la région " + nomR + " (code " + r.getCodeRegion() + ") est de : " + poptotal + " habitants.");
        }
    }
}
