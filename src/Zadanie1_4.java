/*Napisz program, który na wejściu przyjmuje 5 liczb całkowitych,
a następnie wyświetla je w posortowanej kolejności.
 */
import java.util.Arrays;
import java.util.Scanner;

public class Zadanie1_4 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int[] tab = new int[5];
        for (int i=0; i < 5; i++) {
            tab[i] = in.nextInt();
        }
        Arrays.sort(tab);  //sortowanie tablicy
        for (int i=0; i < 5; i++) {
            System.out.println(tab[i]);
        }
    }
}
