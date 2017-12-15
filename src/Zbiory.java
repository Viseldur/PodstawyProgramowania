import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Zbiory {

    public static void main(String[] args) {

        String[] imiona1 = {"Tomek", "Jacek", "Piotrek", "Wojtek", "Tomek"};
        String[] imiona2 = {"Gosia", "Tomek", "Piotrek", "Julia", "Gosia"};

        // HashSet
        Set<String> hashSet = new HashSet<>();

        // TreeSet - analogicznie mozna zainicjowac HashSet
        Set<String> treeSet = new HashSet<String>(Arrays.asList(imiona2));

        // Dodawanie elementow do zbioru
        for (String slowo : imiona1)
            // wazne- metoda zwraca true/false w zaleznosci czy obiekt jest juz w zbiorze
            hashSet.add(slowo);

        // alternatywnie
        // Collections.addAll(hashSet, imiona1);

        // wyswietlanie zbioru
        // kolejnosc elementow w HashSet niedeterministyczna
        System.out.println(hashSet);
        // elementy w TreeSet posortowane
        System.out.println(treeSet);

        // laczenie zbiorow
        hashSet.addAll(Arrays.asList(imiona2));

        // wyciagnie czesci wspolnej
        hashSet.retainAll(treeSet);

        // odejmowanie zbiorow
        hashSet.removeAll(treeSet);

        // sprawdzanie czy zbior zawiera element
        boolean czyZawiera = hashSet.contains("Tomek");

        // usuniecie elementu ze zbioru
        hashSet.remove("Tomek");

        // rozmiar zbioru
        hashSet.size();

        // iterowanie
        Iterator<String> iterator = hashSet.iterator();
        while(iterator.hasNext()) {
            String imie = iterator.next();
            // usuwanie
            // iterator.remove();
        }

        //czysczenie zbioru
        hashSet.clear();
    }

}
