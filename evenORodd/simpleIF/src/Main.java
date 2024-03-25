import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = numInput.nextInt();

        if (number > 50) {
            number = number * 2;
        }
        System.out.println(number);
    }
}