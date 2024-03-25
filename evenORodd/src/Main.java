import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a;
        Scanner aInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        a = aInput.nextInt();

        int b;
        Scanner bInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        b = bInput.nextInt();

        int c;
        Scanner cInput = new Scanner(System.in);
        System.out.println("Enter a number: ");
        c = cInput.nextInt();

        if (a>b && b>c) {
            System.out.println(a+" is the largest number.");
        }
        else if (b>a && a>c) {
            System.out.println(b+" is the largest number.");
        }
        else {
            System.out.println(c+" is the largest number.   ");
        }
    }
}
