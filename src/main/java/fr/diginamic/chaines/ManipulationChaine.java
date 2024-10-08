package fr.diginamic.chaines;



//8) Créez une classe Salarie dans le package entites avec 3 attributs
//a. nom : String
//b. prenom : String
//c. salaire : double
//9) A partir des 3 morceaux de chaine de caractères précédents, créez une instance de
//Salarie :
//a. Consigne : le nombre « 2 523.5» contient un espace qu’il faut supprimer en
//utilisant la méthode replace(String, String) de la classe String
//b. Astuce : pour transformer une chaine de caractères en double, utilisez la
//méthode static de la classe Double : Double.parseDouble(String)
public class ManipulationChaine {
    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";
        char test = chaine.charAt(0);
        int indexChar = chaine.indexOf(';');
        String extraire = chaine.substring(0, 6);
        String majuscules = extraire.toUpperCase();
        String minuscules = extraire.toLowerCase();
        String[] morceaux = chaine.split(";");
        System.out.println("Le prermier caractère est : " + test);
        System.out.println("La longueur de la chaine est : " + chaine.length());
        System.out.println("Afficher l’index du ; et le nom : " + indexChar + " " + extraire);
        System.out.println("Nom de famille ne majuscules : " + majuscules);
        System.out.println("Nom de famille ne minuscules : " + minuscules);
        System.out.println("Chaine en morceau : ");
        for (String partie : morceaux) {
            System.out.println(partie);
        }
    }
}
