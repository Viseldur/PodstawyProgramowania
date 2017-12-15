import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Listy {
    public static void main(String[] args) {
        String[] slowa = {"ala", "ma", "kota", "i", "psa"};

        // Ponizsze przyklady dotycza ArrayList
        // Analogiczną funkcjonalnosc dostarcza też LinkedList
        // List<String> linkedList = new LinkedList<>();

        // inicjowanie pustej listy
        List<String> arrayList = new ArrayList<>();

        // alternatywnie z jednoczesnym inicjowaniem
        // List<String> arrayList = Arrays.asList(slowa);

        // wstawienie elementów do listy
        for (String slowo : slowa)
            arrayList.add(slowo);

        // alternatywnie
        // Collections.addAll(arrayList, slowa);

        // wyswietlenie listy
        System.out.println(arrayList);

        // rozmiar listy
        int rozmiar = arrayList.size();

        // pobranie i-tego elemntu listy
        String s = arrayList.get(2);

        // wstawienie elementu na i-ta pozycje
        arrayList.add(2, "orzel");

        // zastapienie elementu na i-ta pozycji
        arrayList.set(2, "sowa");

        // usunięcie elemntu z i-tej pozycji
        arrayList.remove(2);

        // usuniecie okreslonego obiektu z listy (wazna metoda equals)
        arrayList.remove("kota");

        // iterowanie po liscie podobnie jak dla tablic
        for (String slowo : arrayList)
            System.out.println(slowo);

        // lub za pomoca iteratora
        Iterator<String> iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            // pobranie nastepnego elemntu
            System.out.println(iterator.next());
            // usuniecie ostatniego elementu zwroconego przez iterator
            // iterator.remove();
        }

        //wyczyszczenie listy, usunięcie jej wszystkich elementow
        arrayList.clear();
    }
}
