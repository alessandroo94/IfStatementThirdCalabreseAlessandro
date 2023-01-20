import java.util.Random;

public class Student {
    private String name;
    private int age;


    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }



    public void guessingAge(){
        Random random = new Random();
        int randomAge = random.nextInt(35);

        System.out.println("I  generated the random number " + randomAge + " for student " + name);

        if(randomAge == age){
            System.out.println("The generated age is equal to student's age.");
        } else if (randomAge > age) {
            System.out.println("The generated age is greater than student's age.");
        } else {
            System.out.println("The generated age is less than student's age.");
        }
    }
}
