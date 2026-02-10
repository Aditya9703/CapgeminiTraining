package capg;

import java.util.*;

public class TaskB_2 {
    public static void main(String[] args) {

        LinkedList<String> q = new LinkedList<>();

        q.add("Ramesh");
        q.add("Sita");
        q.add("Aman");
        q.add("Neel");
        q.add("Puja");

        q.addFirst("Emergency");

        q.remove();
        q.remove();

        for (String s : q)
            System.out.print(s + " ");
    }
}

