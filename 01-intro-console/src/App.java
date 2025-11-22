public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("типи данних в Java");
        // примітивні типи
        int userAge = 20;
        double height = 1.75;
        boolean isStudent = true;
        char grade = 'A';

        // посилальні типи
        String name = "John Doe";
        boolean isAvtive = false;
        System.out.println(userAge);
        System.out.println(name);

       if(isAvtive){
        System.out.println("User is active");
       } else {
        System.out.println("User is not active");  
    }
    int score = 85;
    if(score >= 90){
        System.out.println("Grade: A");
    } else if(score >= 80){
        System.out.println("Grade: B");
    } else {
        System.out.println("Grade: C");
    }

    for (int i = 1; i <= 5; i++){
        System.out.println(i);
    }

    int j = 1;
    while (j <= 5){
        System.out.println(j);
        j++;
    }
    }
}
