package Basicjava;

class Student {
    String name;
    int id;
    int age;

    Student(String name,int id , int age){
        this.name = name;
        this.age = age;
        this.id = id;
    }
}

interface Function<T , K> {
     K call (T obj);
}

class DynamicExtractor <T,K>{
    private Function<T, K> function;
    DynamicExtractor(Function<T,K> function){
        this.function = function;
    }
    K extract(T obj){
        return function.call(obj);
    }
}

public class DynamicGenericMultipleTypeGeneric {
    public static void main(String[] args) {
        Student s = new Student("Sarthak" ,1,21);
        DynamicExtractor<Student,String> nameEx = new DynamicExtractor<>(Student -> Student.name);
        System.out.println(nameEx.extract(s));
    }
}