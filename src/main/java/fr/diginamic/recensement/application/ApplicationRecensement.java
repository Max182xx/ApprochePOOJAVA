package fr.diginamic.recensement.application;

import fr.diginamic.recensement.entites.Recensement;
import fr.diginamic.recensement.menu.*;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ApplicationRecensement {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in); // va permettre de récupérer la saisie utilisateur
        char rep = 'o'; // réponse de l'utilisateur
        int choix = 0; // correspond à l'option de menu de l'utilisateur

        while (rep == 'o' || rep == 'O') {
            do { // boucle d'affichage du menu tant que le choix utilisateur est différent des 9 options
                System.out.println(""" 
                                _                   _  _               _    _                   \s
                               / \\    _ __   _ __  | |(_)  ___   __ _ | |_ (_)  ___   _ __   ___\s
                              / _ \\  | '_ \\ | '_ \\ | || | / __| / _` || __|| | / _ \\ | '_ \\ / __|
                             / ___ \\ | |_) || |_) || || || (__ | (_| || |_ | || (_) || | | |\\__ \\
                            /_/   \\_\\| .__/ | .__/ |_||_| \\___| \\__,_| \\__||_| \\___/ |_| |_||___/
                                     |_|    |_|                                                 \s
                              ____                                                               _  \s
                            |  _ \\   ___   ___   ___  _ __   ___   ___  _ __ ___    ___  _ __  | |_\s
                            | |_) | / _ \\ / __| / _ \\| '_ \\ / __| / _ \\| '_ ` _ \\  / _ \\| '_ \\ | __|
                            |  _ < |  __/| (__ |  __/| | | |\\__ \\|  __/| | | | | ||  __/| | | || |_\s
                            |_| \\_\\ \\___| \\___| \\___||_| |_||___/ \\___||_| |_| |_| \\___||_| |_| \\__|
                        Menu :
                         1. Population d’une ville donnée
                         2. Population d’un département donné
                         3. Population d’une région donnée
                         4. Afficher les 10 régions les plus peuplées
                         5. Afficher les 10 départements les plus peuplés
                         6. Afficher les 10 villes les plus peuplées d’un département
                         7. Afficher les 10 villes les plus peuplées d’une région
                         8. Afficher les 10 villes les plus peuplées de France
                         9. Sortir
                        (choisir  parmi les options de 1 à 9)""");

                try {
                    choix = sc.nextInt(); // saisie de l'option de menu

                    // Vérification de la validité du choix
                    if (choix < 1 || choix > 9) {
                        System.out.println("Erreur : veuillez entrer un numéro entre 1 et 9.");
                    } else {
                        switch (choix) { // Traitement des différentes options de menu
                            case 1:
                                RecherchePopulationVille recherchePv = new RecherchePopulationVille();
                                recherchePv.traiter(new Recensement(), sc);
                                break;
                            case 2:
                                RechercheDepartement rechercheDpt = new RechercheDepartement();
                                rechercheDpt.traiter(new Recensement(), sc);
                                break;
                            case 3:
                                RechercheRegion rechercheR = new RechercheRegion();
                                rechercheR.traiter(new Recensement(), sc);
                                break;
                            case 4:
                                LesDixRegionsPlusPeuplees rechercheRp = new LesDixRegionsPlusPeuplees();
                                rechercheRp.traiter(new Recensement(), sc);
                                break;
                            case 5:
                                LesDixDepatementsPlusPeuples rechercheDdp = new LesDixDepatementsPlusPeuples();
                                rechercheDdp.traiter(new Recensement(), sc);
                                break;
                            case 6:
                                LesDixVillesDepartement rechercheDvp = new LesDixVillesDepartement();
                                rechercheDvp.traiter(new Recensement(), sc);
                                break;
                            case 7:
                                LesDixVillesRegions rechercheDvr = new LesDixVillesRegions();
                                rechercheDvr.traiter(new Recensement(), sc);
                                break;
                            case 8:
                                DixVillesDeFrance rechercheDvf = new DixVillesDeFrance();
                                rechercheDvf.traiter(new Recensement(), sc);
                                break;
                            case 9:
                                sc.close();
                                Sortie.sortie();
                                break;
                        }
                    }

                } catch (InputMismatchException e) {
                    // Si l'utilisateur entre une lettre ou un caractère invalide
                    System.out.println("Erreur : veuillez entrer un nombre valide et aucun lettre.");
                    sc.next(); // consommer l'entrée invalide
                }
            } while (choix < 1 || choix > 9); // Redemander si le choix est hors limites
        }

        // Fin de la boucle on sort du programme
        sc.close();
        System.exit(0);
    }
}
