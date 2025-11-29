public class ClassDemo {
    public static void main(String[] args) {
        System.out.println(" створення обьектів");

        int sc = Student.getStudentCount();
        System.out.println("Кількість студентів: " + sc);

        // cтворення об'єкту (екземпляру) класу Student
        Student student1 = new Student();
        student1.nikName = "name1";
        student1.setName("reri");
        student1.setAre(20);
    
        Student student2 = new Student();
        student2.nikName = "name2";
        student2.setName("tire");
        student2.setAre(29);

        student1.introduce();
        student2.introduce();

        // приклад састичних методів
        String strNumber = "123";
        int myNumber = Integer.parseInt(strNumber);


        System.out.println("вік: " + student1.getAge());
        System.out.println("імя: " + student1.getAge());
    }

}

class Student {
    // поля (властивості, атрибути)
    // public, private
    private String name;
    private int age;

    private static int studentCount = 0;
    public String nikName;

    public Student() {
        studentCount ++;
    }

    // конструктор з параметрами (перевантаження конструктора)
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
        studentCount ++;
    }

    // сетер для змінного поля
    public void setName(String name) {
        if (name != null && !name.isEmpty()) {
            this.name = name;
        } else {
            System.out.println("Недопустиме ім'я студента");
        }
    }

    public String getName() {
        return this.name;
    }

    public void setAre(int age) {
        if(age > 0 && age < 150) {
            this.age = age;
        }
    }

    public int getAge() {
        return this.age;
    }

    public void introduce() {
        System.out.println("My name is " + this.name + ", I am " + this.age + " years");
    }

    public static int getStudentCount() {
        return studentCount;
    }

    /* ... інші методи */



}
