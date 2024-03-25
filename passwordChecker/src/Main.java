import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String storedPassword="1324samu";
        String password;
        Scanner myInputs = new Scanner(System.in);
        System.out.println("Enter your password:");
        password=myInputs.nextLine();

        if(password.length()<8){
            System.out.println("Password must have at least 8 characters!");
        } else if (!password.matches("[a-zA-Z0-9]+")) {
            System.out.println("Password must only contain letters and digits!");
        }
        else {
            System.out.println("Password Accepted!");
        }

        //Checking if password entered matches stored password
        if (password.compareTo(storedPassword)==0){
            System.out.println("Correct Password!");
        }
        else{
            System.out.println("Incorrect Password!");
        }

    }
}