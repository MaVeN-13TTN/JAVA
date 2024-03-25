// Abstract class representing a table
abstract class Table {
    protected int width;
    protected int length;
    protected int numDrawers;

    // Constructor
    public Table(int width, int length, int numDrawers) {
        this.width = width;
        this.length = length;
        this.numDrawers = numDrawers;
    }

    // Abstract method to calculate the base price
    public abstract int calculateBasePrice();

    // Abstract method to calculate the total cost
    public abstract int calculateTotalCost();

    // Abstract method to calculate the wood price
    public abstract int woodPrice();

    // Method to get the drawer cost
    public int getDrawerCost() {
        int drawerCost;
        if (numDrawers > 0) {
            drawerCost = 2500 + ((numDrawers - 1) * 2000);
        } else {
            drawerCost = 0;
        }
        return drawerCost;
    }

    // Method to get the area of the table
    public int getArea() {
        return width * length;
    }
}
