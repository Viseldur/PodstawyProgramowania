/*Napisz program który przyjmie kolejno 8 parametrów a następnie wyświetli krótki tekst z użyciem tych parametrów.
Temat dowolny, np. cv osoby, motoryzacja, zwierzęta, itd.
 */
import java.util.Scanner;

public class Zadanie1_2 {
    public static void main(String[] args) {
        Scanner odczyt = new Scanner(System.in);
        String imie, nazwisko, mail, zagranica, numer, wyksztalcenie;
        int wiek, staz;
        System.out.println("Imię:");
        imie = odczyt.nextLine();
        System.out.println("Nazwisko:");
        nazwisko = odczyt.nextLine();
        System.out.println("Wiek:");
        wiek = odczyt.nextInt();
        System.out.println("Numer telefonu:");
        numer = odczyt.next();
        System.out.println("Adres e-mail:");
        mail = odczyt.next();
        System.out.println("Staż pracy (w latach):");
        staz = odczyt.nextInt();
        System.out.println("Wykształcenie wyższe (T/N)?");
        wyksztalcenie = odczyt.next();
        System.out.println("Czy jest możliwość pracy za granicą?");
        zagranica = odczyt.next();
        System.out.println(imie + " " + nazwisko);
        System.out.println("Wiek: " + wiek);
        System.out.println("Numer telefonu: " + numer);
        System.out.println("Adres mail: " + mail);
        System.out.println("Staż pracy: " + staz + " lata");
        if (wyksztalcenie.startsWith("T"))  {
            System.out.println("Wykształcenie wyższe: TAK");
        }
            else if (wyksztalcenie.startsWith("N")) {
                System.out.println("Wykształcenie wyższe: NIE");
            }
            if (zagranica.startsWith("T")) {
                System.out.println("Możliwość pracy za granicą: TAK");
            } else if (zagranica.startsWith("N")) {
                System.out.println("Możliwość pracy za granicą: NIE");
            }
        }
    }
