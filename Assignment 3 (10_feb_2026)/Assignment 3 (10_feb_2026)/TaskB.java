package capg;
import java.util.*;

public class TaskB {
    public static void main(String[] args) {

        LinkedList<String> q = new LinkedList<>();

        q.add("Amit");
        q.add("Ravi");
        q.add("Neha");
        q.add("Pooja Singhal");
        q.add("Karan");

        q.remove();
        q.remove();

        for (String s : q)
            System.out.print(s + " ");
    }
}
