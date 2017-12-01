/*
Napisz program realizujący funkcje prostego kalkulatora, pozwalający na wykonanie operacji
 dodawania, odejmowania, mnożenia i dzielenia na dwóch liczbach dziesiętnych.
 Program ma identyfikować próbę wykonania działania innego niż 4 dopuszczalne i
 informować o tym użytkownika.
 */

import java.util.Scanner;

public class Zadanie1_7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Witaj w programie do obliczania dwóch liczb!");
        System.out.println("Podaj pierwszą liczbę:");
        float x = in.nextFloat();
        System.out.println("Podaj drugą liczbę:");
        float y = in.nextFloat();
        System.out.println("Poniżej instrukcja:");
        System.out.println("Suma: + ");
        System.out.println("Różnica: - ");
        System.out.println("Iloczyn: * ");
        System.out.println("Iloraz: / ");
        System.out.println("Wybierz operację: ");
        char znak = in.next().charAt(0);
        if (znak == '+' || znak == '-' || znak == '*' || znak == '/') {
            switch (znak) {
                case '+': {
                    System.out.println(x + y);
                    break;
                }
                case '-': {
                    System.out.println(x - y);
                    break;
                }
                case '*': {
                    System.out.println(x * y);
                    break;
                }
                case '/': {
                    if (y != 0) {
                        System.out.println(x / y);
                        break;
                    } else {
                        System.out.println("Nie można dzielić przez 0!");
                    }
                }
            }
        }
        else {
            System.out.println("Użyj dozwolonych operacji: +, -, *, /");
        }
    }
}