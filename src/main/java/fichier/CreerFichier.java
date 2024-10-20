package fichier;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("C:\\Developpement\\Java\\ApprochePOOJAVA\\recensement.csv");
        List<String> ligneEntree = Files.readAllLines(path);

        ArrayList<String> ligneSortie = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            ligneSortie.add(ligneEntree.get(i));
        }
        Path path1 = Paths.get("C:\\Developpement\\Java\\ApprochePOOJAVA\\recensement1.csv");
        Files.write(path1, ligneSortie);

        System.out.println(ligneSortie);
    }
}
