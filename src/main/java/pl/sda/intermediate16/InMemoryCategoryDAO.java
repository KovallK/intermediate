package pl.sda.intermediate16;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class InMemoryCategoryDAO {                  //klasa do stworzenia listy kategorii ,DAO znaczy Data Accrss Object

    private void loadCategoriesFromFile() {
        ClassLoader classLoader = this.getClass().getClassLoader();
        URI uri = null;//wczytywanie pliku za pomocą klasy ClassLoader,Uri to adres,ścieżka do pliku/zasobu
        try {
            uri = classLoader.getResource("kategorie.txt").toURI();
            List<String> lines = Files.readAllLines(Paths.get(uri));
        } catch (IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }
}
