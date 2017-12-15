import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.PriorityQueue;

public class Kolejki {

    public static void main(String[] args) {
        String[] imiona = {"Tomek", "Jacek", "Piotrek", "Wojtek", "Andrzej"};

        // stworzenie kolejki
        ArrayDeque<String> arrayDeque = new ArrayDeque<>();

        // alternatywnie z inicjalizacja
        // ArrayDeque<String> arrayDeque = new ArrayDeque<>(Arrays.asList(imiona1));

        // dodawanie elemntow do kolejki
        for (String imie : imiona)
            // alternatywnie tez: addLast, offerLast
            arrayDeque.add(imie);
        // na poczatek kolejki:
        //arrayDeque.addFirst(imie);
        //arrayDeque.offerFirst(imie);

        // alternatywnie
        // Collections.addAll(arrayDeque, imiona1);

        // wyswietlenie kolejki
        System.out.println(arrayDeque);

        // sprawdzenie, nie usuniecie pierwszego elementu kolejki
        // alternatywnie tez: peekFirst, getFirst
        String pierwszy = arrayDeque.peek();
        // z konca kolejki
        String ostatni = arrayDeque.peekLast();

        // pobranie pierwszego elemntu z kolejki (usuniecie go z kolejki)
        // alternatywnie tez: pop, removeFirst
        pierwszy = arrayDeque.poll();
        // z konca kolejki
        ostatni = arrayDeque.pollLast();

        // sprawdzenie czy kolejka jest pusta
        arrayDeque.isEmpty();

        // rozmiar kolejki
        arrayDeque.size();

        // czyszczenie kolejki
        arrayDeque.clear();

        /////////////////////////////////////////////////////////////////

        Osoba[] osoby = {
                new Osoba(90234234434L, "Tomek", "Kowalski", 33, "Kosciuszki 12", 5),
                new Osoba(90234234434L, "Adrian", "Zielinski", 23, "Sienkiewicza 5", 2),
                new Osoba(90234234434L, "Wojtek", "Czerwony", 32, "Wolnosci 43", 1),
                new Osoba(90234234434L, "Maciek", "Brazowy", 53, "Kwiatowa 1", 10),
                new Osoba(90234234434L, "Marcin", "Niebieski", 20, "Strzegomska 4", 8)
        };

        // kolejka oparta na priorytetach
        PriorityQueue<Osoba> priorityQueue = new PriorityQueue<>();

        // metody analogiczne jak w przypadku ArrayDequeue

        for (Osoba osoba : osoby)
            priorityQueue.add(osoba);

        System.out.println(Arrays.toString(osoby));

        while (!priorityQueue.isEmpty())
            System.out.println(priorityQueue.poll());
    }
}
