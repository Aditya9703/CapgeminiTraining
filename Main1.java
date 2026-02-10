package Basicjava;

public class Main1 {
    public static void main(String[] args) {
        // Now we can create an ArrayList of ANY type (e.g., Integer, String)
        MyArrayList<Integer> list = new MyArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);

        System.out.println("Printing Integer List:");
        list.print();
        
        System.out.println("\nElement at index 4: " + list.get(4));

        // We can also create a String list now
        MyArrayList<String> stringList = new MyArrayList<>();
        stringList.add("Hello");
        stringList.add("World");
        
        System.out.println("\nPrinting String List:");
        stringList.print();
    }
}

// 1. Add <E> here to declare the generic type
class MyArrayList<E> {
    
    // 2. Change int[] to Object[] (Generics use Object arrays internally)
    private Object[] data; 
    private int size;

    public MyArrayList() {
        // 3. Initialize as Object[]
        data = new Object[4];
        size = 0;
    }

    // 4. Change 'int value' to 'E value'
    public void add(E value) {
        if (size == data.length) {
            resize(); 
        }
        data[size++] = value;
    }

    private void resize() {
        // 5. Create new Object[] instead of int[]
        Object[] newData = new Object[data.length * 2];
        for(int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public void print() {
        for(int i = 0; i < size; i++) { // Better to iterate to 'size' to avoid printing nulls
            System.out.print(data[i] + " ");
        }
    }

    // 6. Change return type to E
    @SuppressWarnings("unchecked")
    public E get(int index) {
        if(index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        
        // 7. Must cast the Object back to E
        return (E) data[index];
    }
}