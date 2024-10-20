package fichier;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {
    public static void main(String[] args) throws Exception {

        ArrayList<Ville> ville = new ArrayList<>();

        Path path = Paths.get("C:\\Developpement\\Java\\ApprochePOOJAVA\\recensement.csv");

        List<String> lines = Files.readAllLines(path);

        for (int i= 1; i< lines.size(); i++){
            String[] tokens = lines.get(i).split(";");

            String nom = tokens[6];
            String codePostale = tokens[0] +tokens[2] +tokens [3] + tokens [4];
            String nomDeLaRegion = tokens [1];
            int population = Integer.parseInt(tokens[9].replaceAll(" ", ""));

            ville.add(new Ville(nom, codePostale, nomDeLaRegion, population));
        }

        System.out.println(ville);
    }
}
