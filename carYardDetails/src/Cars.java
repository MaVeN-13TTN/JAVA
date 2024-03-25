public class Cars {
    private String model;
    private String make;
    private int price;

    public Cars(String model, String make, int price){
        this.model = model;
        this.make = make;
        this.price = price;
    }

    void getDetails(){
        System.out.println("Model: " + model);
        System.out.println("Make: " + make);
        System.out.println("Price: " + price);
    }
    int getPrice(){
        return price;
    }
}
