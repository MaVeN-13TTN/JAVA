public class Main {
    public static void main(String[] args) {
        ForeignStudent foreignStudent = new ForeignStudent("Samuel","1324AWEWM");
        foreignStudent.studentName();
        foreignStudent.studentDetails();

        NativeStudent nativeStudent = new NativeStudent("Kamunge", "Kiambu");
        nativeStudent.studentName();
        nativeStudent.studentDetails();
    }
}