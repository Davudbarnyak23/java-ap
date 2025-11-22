public class Dog {
    String name;
    int age;

    Dog(String name, int age){
        this.name = name;
        this.age = age;
    }


    void run(){
        System.out.println("Біжить");

    }

    void bark(){
        System.out.println("гавкає");
    }
}

public class Main {
    public static void main(String[] args){
        Dog dog1 = new Dog("Гавчик", 3);
        Dog dog1 = new Dog("Рекс", 3);
    }

    // TODO: ЗАВЕРШИТИ КЛАС DOG ЗАВДАННЯМИ:
}

