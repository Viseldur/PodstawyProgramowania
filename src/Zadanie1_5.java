import java.util.Scanner;

public class Zadanie1_5 {
    public static void main(String[] args) {
        // V=(4/3)*PI*r^3
        // P=4*pi*R^2
        Scanner in = new Scanner(System.in);
        double r, v, p;
        System.out.println("Podaj promień kuli:");
        r = in.nextDouble();
        v = 4*Math.PI*Math.pow(r,3)/3;
        p = 4*Math.PI*r*r;
        System.out.printf("Objętość kuli wynosi: %.2f",v);
        System.out.printf("\nPole kuli wynosi: %.2f",p);
    }
}
