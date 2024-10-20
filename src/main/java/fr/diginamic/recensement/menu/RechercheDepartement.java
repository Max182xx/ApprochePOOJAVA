package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.entites.Departement;
import fr.diginamic.recensement.entites.Recensement;

import java.util.Scanner;

public class RechercheDepartement {

    // Constructeur
    public RechercheDepartement() {
    }

    // Méthode qui permet de traiter la recherche de population d'un département
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("De quel département (en chiffre) voulez-vous connaître la population totale ?");
        scanner = new Scanner(System.in);
        // Lecture de l'entrée utilisateur (le code du département)
        String v = scanner.nextLine();

        // Vérification pour exclure les lettres (Regex) et capturer une saisie non numérique
        if (!v.matches("\\d+")) {
            System.out.println("Erreur: La saisie \"" + v + "\" n'est pas un numéro de département valide. Veuillez entrer uniquement des chiffres.");
            return;  // On arrête l'exécution si la saisie n'est pas valide
        }

        // Création du département
        Departement d = new Departement(v);

        // Variable pour stocker la population totale du département
        int poptotal = 0;
        boolean departementExiste = false;

        // Boucle qui parcourt la liste des communes dans le recensement et calcule la population totale du département
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {
            // Si le département existe
            if (d.getDepartement().equals(recensement.getMesCommunes().get(i).getDpt().getDepartement())) {
                poptotal += recensement.getMesCommunes().get(i).getPopTotale();
                departementExiste = true;
            }
        }

        // Vérification si le département est inconnu
        if (!departementExiste) {
            System.out.println("Erreur: Le département " + v + " est inconnu.");
            return; // On arrête l'exécution si le département n'existe pas
        }

        // Affichage du résultat
        System.out.println("Le département " + v + " a " + poptotal + " habitants.");
    }
}
