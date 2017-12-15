import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Mapy {

    public static void main(String[] args) {

        String[] slownik = {"jablko", "apple", "gruszka", "pear", "banan", "banana", "wisnia", "cherry", "pomarancza", "orange"};

        // tworzenie hashmapy
        Map<String, String> hashMap = new HashMap<>();

        // analogicznie dla posortowanej mapy
        Map<String, String> treeMap = new TreeMap<>();

        // inicjalizacja
        for (int i = 0; i < slownik.length; i += 2)
            hashMap.put(slownik[i], slownik[i + 1]);

        System.out.println(hashMap);

        // pobranie elementu dla klucza 'gruszka'
        String tlumaczenieGruszka = hashMap.get("gruszka");

        // sprawdzenie czy istnieje wpis o zadanym kluczu
        boolean gruszka = hashMap.containsKey("gruszka");

        // rozmiar mapy
        int rozmiar = hashMap.size();

        // pobranie zbioru kluczy i wartosci
        Set<String> klucze = hashMap.keySet();
        Collection<String> wartosci = hashMap.values();

        // usuniecie wpisu o zadanym kluczu
        hashMap.remove("gruszka");

        // wyczyszczenie slownika
        hashMap.clear();
    }

}
