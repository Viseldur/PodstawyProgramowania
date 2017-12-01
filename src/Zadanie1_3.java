//Napisz program, który na wejściu przyjmuje 3 liczby całkowite, a na wyjściu wyświetla największą z nich.

import java.util.Scanner;

public class Zadanie1_3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b, c;
        System.out.println("Podaj A");
        a = in.nextInt();
        System.out.println("Podaj B");
        b = in.nextInt();
        System.out.println("Podaj C");
        c = in.nextInt();

        if ((a > b) && (a > c))
        {
            System.out.println("Największa liczba: " + a);
        }
        else if (b > c)
        {
            System.out.println("Największa liczba: " + b);
        }
        else
        {
            System.out.println("Największa liczba: " + c);
        }
    }
}