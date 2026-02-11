package Basicjava;

interface MyComparator<T> {
    int compare(T a, T b);
}

class GenericBubbleSort {

    public static <T> void sort(T[] arr, MyComparator<T> cmp) {

        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {

                if (cmp.compare(arr[j], arr[j + 1]) > 0) {
                    T temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}

class Student_x {
    int id;
    String name;
    int age;

    Student_x(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return id + " " + name + " " + age;
    }
}

public class GenericSortFinal {

    public static void main(String[] args) {

        Student_x[] students = {
            new Student_x(3, "ABC", 23),
            new Student_x(1, "XYZ", 20),
            new Student_x(2, "LMN", 22)
        };

        // Sort by ID
        GenericBubbleSort.sort(students,
            (a, b) -> Integer.compare(a.id, b.id));

        System.out.println("Sorted by ID:");
        for (Student_x s : students)
            System.out.println(s);

        // Sort by Name
        GenericBubbleSort.sort(students,
            (a, b) -> a.name.compareTo(b.name));

        System.out.println("\nSorted by Name:");
        for (Student_x s : students)
            System.out.println(s);

        // Sort by Age
        GenericBubbleSort.sort(students,
            (a, b) -> Integer.compare(a.age, b.age));

        System.out.println("\nSorted by Age:");
        for (Student_x s : students)
            System.out.println(s);
    }
}
