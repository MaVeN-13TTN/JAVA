import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int firstNumber;
        int secondNumber;
        Scanner myInput = new Scanner(System.in);
        System.out.println("Enter the first number:");
        firstNumber=myInput.nextInt();
        System.out.println("Enter the second number:");
        secondNumber=myInput.nextInt();
        int sum = firstNumber + secondNumber;
        System.out.println("The sum is "+sum);
    }
}