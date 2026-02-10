package capg;

public class GenericArraylist {

    public static void main(String[] args) {

        MyArrayList2<Integer> list = new MyArrayList2<>();

        list.add(1);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(90);
        list.add(100);

        list.print();

        list.add(1);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(0);
        list.add(100);

        list.add(1);
        list.add(20);
        list.add(50);
        list.add(60);
        list.add(90);
        list.add(100);

        list.print();
        System.out.println(list.search(50));

        list.sort();
        list.print();
    }
}

class MyArrayList2<T> {

    private T[] data;
    private int size;

    MyArrayList2() {
        data = (T[]) new Object[4];
    }

    public void add(T el) {
        if (size == data.length)
            resize();
        data[size++] = el;
    }

    private void resize() {
        T[] nd = (T[]) new Object[data.length * 2];
        for (int i = 0; i < size; i++)
            nd[i] = data[i];
        data = nd;
    }

    void print() {
        for (int i = 0; i < size; i++)
            System.out.print(data[i] + " ");
        System.out.println();
    }

    int search(T el) {
        for (int i = 0; i < size; i++)
            if (data[i].equals(el))
                return i;
        return -1;
    }

    void sort() {
        for (int i = 0; i < size - 1; i++) {
            for (int j = i + 1; j < size; j++) {
                if (cmp(data[i], data[j]) > 0) {
                    T t = data[i];
                    data[i] = data[j];
                    data[j] = t;
                }
            }
        }
    }

    int cmp(T a, T b) {
        if (a instanceof Integer)
            return (Integer) a - (Integer) b;

        if (a instanceof String)
            return ((String) a).compareTo((String) b);

        return 0;
    }
}
