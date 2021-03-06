/*
Napisz program umożliwiający wyliczenie miesięcznej raty za zakupiony towar. Program ma otrzymywać na wejściu:
-cenę towaru (np. 1000 zł, maksymalnie 50 000 zł)
-liczbę rat (np. 12, maksymalnie 48 rat)
W zależności od liczby rat program przypisuje oprocentowanie:
-1-12 wynosi 3%
-13-24 wynosi 6%
-25-48 wynosi 10%
i zwraca obliczoną ratę miesięczną.
 */

import java.util.Scanner;

public class Zadanie1_6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj cenę towaru (0-50000): ");
        double cena = in.nextDouble();
        if (cena >= 0 && cena <= 50000) {
            System.out.println("Podaj ilość rat (1-48): ");
            int raty = in.nextInt();
            if (raty >= 0 && raty <= 48)
            {
                if (raty <= 12)
                {
                    double wartosc = 1.03*cena/raty;
                    System.out.println(wartosc);
                }
                else if (raty <= 24)
                {
                    double wartosc = 1.06*cena/raty;
                    System.out.println(wartosc);
                }
                else
                {
                    double wartosc = 1.1*cena/raty;
                    System.out.println(wartosc);
                }
            }
            else {
                System.out.println("Podaj wartość rat od 1 do 48, zacznij jeszcze raz!");
            }
        }
        else {
            System.out.println("Podaj wartość ceny od 0 do 50000 zł, zacznij jeszcze raz!");
        }
    }
}
