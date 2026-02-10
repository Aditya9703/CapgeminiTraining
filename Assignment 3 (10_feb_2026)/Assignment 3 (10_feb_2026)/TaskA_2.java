package capg;

import java.util.*;

public class TaskA_2 {
    public static void main(String[] args) {

        ArrayList<Integer> a = new ArrayList<>();

        a.add(12);
        a.add(5);
        a.add(8);
        a.add(19);
        a.add(30);
        a.add(7);
        a.add(25);
        a.add(14);
        a.add(3);
        a.add(40);

        a.removeIf(x -> x % 2 == 0);

        int mx = Collections.max(a);
        int mn = Collections.min(a);

        a.sort((x, y) -> y - x);

        System.out.println("max=" + mx);
        System.out.println("min=" + mn);

        for (int x : a)
            System.out.print(x + " ");
    }
}
