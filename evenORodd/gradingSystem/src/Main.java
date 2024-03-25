import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        double marks;
        Scanner markInput = new Scanner(System.in);
        System.out.println("Enter marks scored:");
        marks = markInput.nextDouble();

        if(marks>95)
            System.out.println("A");
        else if (marks>80)
            System.out.println("A-");
        else if (marks>70)
            System.out.println("B+");
        else if (marks>50)
            System.out.println("B");
        else
            System.out.println("F");

    }
}