import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> studentList = new ArrayList<>();
        Scanner myInputs = new Scanner(System.in);
        String name;
        int age;
        int sum=0;
        System.out.println("Student Details");

        for (int i=0; i < 5; i++) {
            System.out.println("Enter student " + (i + 1) + " details");
            System.out.println("Enter Name: ");
            name = myInputs.next();
            System.out.println("Enter Age: ");
            age = myInputs.nextInt();
            Student student = new Student(name, age);
            studentList.add(student);
        }

        for (int i=0;i<studentList.size();i++) {
            studentList.get(i).getDetails();
        }

        for (int i=0;i<studentList.size();i++){
            sum=sum+studentList.get(i).getAge();
            //System.out.println("The sum of the ages is " +sum);
        }

        double avgAge=(float)sum/studentList.size();
        System.out.println("Average age: " +avgAge);

    }
}