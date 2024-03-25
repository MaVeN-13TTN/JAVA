public class Student {
    private String name;
    private int age;
    private String major;

    public Student(String name) {
        this.name = name;
    }

    public Student(int age) {
        this.age = age;
    }

    void getDetails(String name, int age, String major){
        this.name = name;
        this.age = age;
        this.major = major;
    }

    void displayDetails(){
        System.out.println("Student Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Major: " + major);
    }
}
