import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class OperacjeNaKolekcjach {

    public static void main(String[] args) {
        // Przyklady uzycia Collections i Arrays

        // tworzenie i inicjowanie kolekcji
        List<String> arrayList = Arrays.asList("ala", "ma", "kota", "i", "psa");

        // sortowanie kolekcji, uzyty jest domyslny komparator obiektow kolekcji
        Collections.sort(arrayList);

        // odwrocenie kolejnosci
        Collections.reverse(arrayList);

        // sortowanie przeciwne
        Collections.sort(arrayList, Collections.reverseOrder());

        // sortowanie z uzyciem wlasnego Comparatora
        Collections.sort(arrayList, new MojComparator());

        // zwraca index znalezionego elemntu, index < 0 gdy nie znaleziono
        int index = Collections.binarySearch(arrayList, "psa");

        // dodawanie nowych elementow
        Collections.addAll(arrayList, "tomek", "zosia");

        // pobranie najwiekszego, najmniejszego elementu
        String min = Collections.min(arrayList);
        String max = Collections.min(arrayList);

    }

    private static class MojComparator implements Comparator<String>{

        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    }
}
