public class ForeignStudent extends Student {
    private String passportNumber;
    public ForeignStudent(String name, String passportNumber){
        super(name);
        this.passportNumber = passportNumber;
    }
    void studentDetails(){
        System.out.println("Passport; "+passportNumber);
    }
}
