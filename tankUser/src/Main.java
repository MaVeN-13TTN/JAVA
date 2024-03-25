import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String storedPass="Kamau2217";
        String enteredPass;
        Scanner myInputs = new Scanner(System.in);
        System.out.println("Enter your password:");
        enteredPass=myInputs.nextLine();

        //Checking if password entered matches stored password
        if (enteredPass.compareTo(storedPass)==0){
            System.out.println("Correct Password!");

        //Using the system
        double radius;
        Scanner radiusInput = new Scanner(System.in);
        System.out.println("Enter the radius of the tank in Metres:");
        radius=radiusInput.nextDouble();

        double height;
        Scanner heightInput = new Scanner(System.in);
        System.out.println("Enter the height of the tank in Metres:");
        height=heightInput.nextDouble();

        //Compute amount of water that can be stored in the tank
        double volumeOfTheTank= ((22/7)*height*radius*1000);
        System.out.println("The volume of your tank is "+volumeOfTheTank+ " litres.");
        }
        else{
            System.out.println("Incorrect Password!");
            System.out.println("You cannot use the system!");
        }

    }
}