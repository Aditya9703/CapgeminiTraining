package Basicjava;

import java.util.*;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    public String toString() {
        return rollNo + " " + name;
    }
}

class RollNoComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.rollNo - s2.rollNo;
    }
}

public class Main {

    static void bubbleSort(List<Student> list, Comparator<Student> comp) {
        int n = list.size();
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (comp.compare(list.get(j), list.get(j + 1)) > 0) {
                    Student temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();

        List<Student> students = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int roll = sc.nextInt();
            String name = sc.next();
            students.add(new Student(roll, name));
        }

        bubbleSort(students, new RollNoComparator());

        for (Student s : students)
            System.out.println(s);
    }
}

