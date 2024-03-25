import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Cars> carsList = new ArrayList<>();
        String model;
        String make;
        int price;
        int sum = 0;

        int n;
        Scanner myInputs = new Scanner(System.in);
        System.out.println("Enter the number of cars: ");
        n = myInputs.nextInt();

        System.out.println("Car Details");

        for (int i = 0; i < n; i++) {
            System.out.println("Enter car " + (i + 1) + " details");
            System.out.println("Enter Car Model: ");
            model = myInputs.next();
            System.out.println("Enter Car Make: ");
            make = myInputs.next();
            System.out.println("Enter Car Price: ");
            price = myInputs.nextInt();

            Cars cars = new Cars(model, make, price);
            carsList.add(cars);
        }

        for (int i = 0; i < carsList.size(); i++) {
            sum = sum + carsList.get(i).getPrice();
        }

        double avgPrice=(float)sum/carsList.size();
        System.out.println("Average age: " +avgPrice);

    }
}