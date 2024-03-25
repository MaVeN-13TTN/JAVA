import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double number;
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = numInput.nextDouble();

        number=number>50?number*2:number/2;
        System.out.println(number);

    }
}