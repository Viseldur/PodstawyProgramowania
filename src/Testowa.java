import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class Testowa {
    public static void main (String[] args) {
        String[] slownik = {"jablko", "apple", "gruszka", "pear", "banan", "banana", "wisnia", "cherry", "pomarancza", "orange"};

        // tworzenie hashmapy
        Map<String, String> hashMap = new HashMap<>();

        // analogicznie dla posortowanej mapy
        Map<String, String> treeMap = new TreeMap<>();

        // inicjalizacja
        for (int i = 0; i < slownik.length; i += 2)
            hashMap.put(slownik[i], slownik[i + 1]);

        System.out.println(hashMap);
    }
}
