package fr.diginamic.chaines;


import entites.Salarie;

// TP J1 Exercice ManipulationChaine

public class ManipulationChaine {
    public static void main(String[] args) {

        Salarie salaire = new Salarie("Durand", "Marcel", 2523.5);

        String chaine = "Durand;Marcel;2 523.5";
        char test = chaine.charAt(0);
        int indexChar = chaine.indexOf(';');
        String extraire = chaine.substring(0, 6);
        String majuscules = extraire.toUpperCase();
        String minuscules = extraire.toLowerCase();
        String[] morceaux = chaine.split(";");

        String replace = chaine.replace(" ", "");
        String salaireStr = morceaux[2].replace(" ", "");
        Double enDouble = Double.parseDouble(salaireStr);

        System.out.println("Extraire un chiffre d'une chaine de caractères :" + enDouble);
        System.out.println("Le prermier caractère est : " + test);
        System.out.println("La longueur de la chaine est : " + chaine.length());
        System.out.println("Afficher l’index du ; et le nom : " + indexChar + " " + extraire);
        System.out.println("Nom de famille ne majuscules : " + majuscules);
        System.out.println("Nom de famille ne minuscules : " + minuscules);
        System.out.println("Chaine en morceau : ");
        System.out.println("Espace supprimé dans le chiffre 2 523.5 : " + replace);
        for (String partie : morceaux) {
            System.out.println(partie);
        }
    }
}
