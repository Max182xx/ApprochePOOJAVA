package fr.diginamic.recensement.menu;

import fr.diginamic.recensement.entites.Recensement;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Classe de service servant de suqelette aux différentes options de menu
 */
public abstract class MenuService {
    public abstract void traiter (Recensement recensement, Scanner scanner);

    abstract void Ajouter(Recensement r, int c, HashMap<String, Integer> rp);
}
