import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        double sum = 0.0;
        double avg;
        Scanner Input =new Scanner(System.in);
        System.out.println("Enter the number of items:");
        size= Input.nextInt();

        double[] prices =new double[size];
        System.out.println("Enter prices:");
        for (int i=0;i<prices.length;i++){
            System.out.println("Price of item:"+(i+1));
            prices[i]= Input.nextDouble();
            //Compute the sum
            sum = sum+prices[i];
        }
        //Compute the average price
        avg=sum/prices.length;
        System.out.println("Sum "+sum);
        System.out.println("Average "+avg);

        //Price Increment
        for (int i=0;i<prices.length;i++){
            prices[i]=1.16*prices[i];
            System.out.println("New price "+(i+1)+" :"+prices[i]);
        }

    }
}