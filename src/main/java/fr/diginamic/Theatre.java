package fr.diginamic;

//Dans le package fr.diginamic.entites, créez une classe Theatre
//o cette classe a 4 attributs d’instance :
//▪ son nom
//▪ sa capacité max (en nb de personnes)
//▪ le total de clients inscrits
//▪ la recette totale de l’établissement OK
//o Dans la classe Theatre, créez une méthode inscrire qui prend en paramètres :
//▪ le nombre de clients
//▪ le prix de la place
//o Cette méthode effectue le traitement suivant :
//▪ Si la capacité max du théâtre n’est pas atteinte, elle ajoute le nombre de
//clients passé en paramètre au total de clients du théâtre et recalcule la
//recette totale de l’établissement
//▪ Si la capacité max est atteinte, elle affiche un message d’erreur.
//• Dans le package fr.diginamic.essais, créez une classe TestTheatre
//o Créez une instance de Theatre et appelez plusieurs fois la méthode jusqu’à
//obtention du message d’erreur
//o Affichez le total de clients inscrits
//o Affichez la recette totale de l’établissement

public class Theatre {
    public String nom;
    public int capacite;
    public int clients;
    public double recette;

    public Theatre(String nomTheatre, int maxCapacite) {
        this.nom = nomTheatre;
        this.capacite = maxCapacite;
    }

    public void inscrire(int clients, double prixPlace) {

        if (this.clients + clients > this.capacite) {
            System.out.println("La salle est pleine");
        } else {
            this.clients += clients;
            recette += clients * prixPlace;
        }
    }

    @Override
    public String toString() {
        return "Le total de la recette est : " + this.recette + "\n Le nombre de clients est de : " + this.clients;
    }
}
