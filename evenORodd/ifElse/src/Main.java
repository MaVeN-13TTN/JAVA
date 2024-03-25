import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number;
        Scanner numInput = new Scanner(System.in);
        System.out.println("Enter the number: ");
        number = numInput.nextInt();

        if(number>50){
            number=number*2;
        }
        else {
            number=number/2;
        }
        System.out.println(number);
    }
}