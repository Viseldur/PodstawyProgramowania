import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Zadanie2_2 {
    public static void main (String[] args){
        Integer[] zbior1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer[] zbior2 = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        Set<Integer> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();
        Collections.addAll(hashSet, zbior1);
        Collections.addAll(treeSet, zbior2);
        System.out.println("A");
        System.out.println(hashSet);
        System.out.println(treeSet);
        Set<Integer> hashSet3 = new HashSet<>(hashSet);
        hashSet3.removeAll(treeSet);
        System.out.println("B");
        System.out.println(hashSet3.size());
        System.out.println("C");
        hashSet.addAll(treeSet);
        System.out.println("Dodawanie zbiorów " + hashSet);
        hashSet.clear();
        Collections.addAll(hashSet, zbior1);
        hashSet.retainAll(treeSet);
        System.out.println("Część wspólna zbiorów " + hashSet);
        hashSet.clear();
        Collections.addAll(hashSet, zbior1);
        hashSet.removeAll(treeSet);
        System.out.println("Odejmowanie zbiorów " + hashSet);
        hashSet.clear();
        Collections.addAll(hashSet, zbior1);
        treeSet.removeAll(hashSet);
        System.out.println("Dopełnienie pierwszego zbioru " + treeSet);
    }
}
