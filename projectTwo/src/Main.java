public class Main {
    public static void main(String[] args) {
        String firstName="wiLLiam";
        String name="william";
        String secondName="Ruto";
        String fullName=firstName+" "+secondName;
        System.out.println("Full name is "+fullName);
        String fullNameUpperCase=fullName.toUpperCase();
            System.out.println("Full Name in UC "+fullNameUpperCase);
        String fullNameLowerCase=fullName.toLowerCase();
            System.out.println("Full Name in LC "+fullNameLowerCase);

        System.out.println(secondName.substring(0,2));
        System.out.println(secondName.substring(2));
        String firstLetter= firstName.substring(0,1).toUpperCase();
        String remainingLetters= firstName.substring(1).toLowerCase();
        String updatedName=firstLetter+remainingLetters;
        System.out.println(updatedName);

        System.out.println("Your name has "+firstName.length()+" characters.");
        System.out.println("The name "+updatedName+" has "+firstName.length()+" characters.");

        //Comparing two strings
        //String firstName="wiLLiam";
        String Xname="william";

        if(firstName.compareTo(Xname)==0){
            System.out.println(firstName+ " and " +name+ " are equal");
        }
        else {
            System.out.println(firstName+ " and " +name+ " are not equal");
        }

    }
}