import java.util.*;

public class Zadanie2_3 {
    public static void main (String[] args){
        int licznik = 0;
        Map<List<Integer>, Integer> hashMap = new HashMap<>();
        Random random = new Random();
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj X:");
        int x = in.nextInt();
        List<Integer> losowyX = new ArrayList();
        losowyX.add(random.nextInt(x+1));
        System.out.println("Podaj Y:");
        int y = in.nextInt();
        List<Integer> losoweY = new ArrayList();
        for (int i = 0; i <y; i++) {
            losoweY.add(random.nextInt(y+1));
        }
        for (int i = 0; i < losoweY.size(); i++) {
            if(losowyX.get(0) ==losoweY.get(i)) licznik++;
            }
        hashMap.put(losowyX,licznik);
        System.out.println(hashMap);
        System.out.println("Sprawdzenie:");
        System.out.println("Wylosowana liczba to = " + losowyX);
        Collections.sort(losoweY);
        System.out.println("Wylosowane liczny to = " + losoweY);
        }
    }
