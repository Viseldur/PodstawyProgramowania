import java.util.Scanner;

public class Zadanie1_8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj N: ");
        int n = in.nextInt();
        int[] tab = new int[n];
        tab[0] = 0;
        tab[1] = 1;
        for (int i = 2; i < n; i++)
        {
            tab[i]=tab[i-1]+tab[i-2];
        }
        System.out.println(tab[n-1]);
    }
}
