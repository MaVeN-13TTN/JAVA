import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int[] numbers= new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter values");
        for (int index =0;index <5;index++){
            System.out.println("Value "+(index+1)+":");
            numbers[index] = input.nextInt();
        }
        for (int index =0;index <5;index++) {
            System.out.println(numbers[index]);
        }
    }
}