package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.entites.Recensement;

import java.util.HashMap;
import java.util.Scanner;

public class RecherchePopulationVille extends MenuService {
    boolean trouve;

    //Constructeur de ma classe
    public RecherchePopulationVille() {
    }

    @Override
    public void traiter(Recensement recensement, Scanner scanner) {
        System.out.println("De quelle ville voulez-vous connaitre la population totale ?");
        scanner = new Scanner(System.in);
        // Lecture du nom de la ville
        String v = scanner.nextLine();

        // Vérification si la saisie contient des chiffres
        if (v.matches(".*\\d.*")) {
            System.out.println("Erreur : La saisie ne doit pas contenir de chiffres. Veuillez entrer un nom de ville valide.");
            return;  // On arrête l'exécution si la saisie contient des chiffres
        }

        // Boucle qui parcourt la liste des villes (mesCommunes)
        for (int i = 0; i < recensement.getMesCommunes().size(); i++) {

            if (v.equalsIgnoreCase(recensement.getMesCommunes().get(i).getNomCommune())) {
                System.out.println(
                        "La population de " + v + " est de " + recensement.getMesCommunes().get(i).getPopTotale());
                trouve = true;
                break;
            }
        }
        if (!trouve) {
            System.out.println("La ville saisie n'est pas trouvée.");
        }
    }

    @Override
    void Ajouter(Recensement r, int c, HashMap<String, Integer> rp) {

    }
}
