//Napisz program, który na wejściu przyjmuje imię, a następnie wyświetla: Hello <imię> !

import java.util.Scanner;

public class Zadanie1_1 {
    public static void main(String[] args){
        Scanner odczyt = new Scanner(System.in);
        String imie;
        System.out.println("Podaj imię:");
        imie = odczyt.nextLine();
        System.out.println("Hello, " + imie + "!");
    }
}
