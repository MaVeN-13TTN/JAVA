// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

       for (int row =1;row<=100;row++){
           System.out.print("\n");
           for (int col = 1;col<=row;col++)
           {
               System.out.print("*");
           }
       }
    }
}