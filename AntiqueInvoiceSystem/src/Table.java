abstract class Table {

    protected String woodType;
    protected int tableWidth;
    protected int tableLength;
    protected int numDrawers;
    private int drawerCost;
    private int area;

    // Constructor
    public Table(int tableWidth, int tableLength, String woodType,int numDrawers) {
        this.woodType = woodType;
        this.tableWidth = tableWidth;
        this.tableLength = tableLength;
        this.numDrawers = numDrawers;
        calculateArea();
    }

    public int calculateBasePrice() {
        return 42500;
    }

    // Abstract method to be implemented by subclasses
    public abstract int woodPrice();

    // Calculate the total cost of the table
    public int calculateTotalCost() {
        int standardArea = 80 * 120;
        int areaDifference = area - standardArea;
        int additionalAreaCost = areaDifference * 825;

        int woodTypeCost = woodPrice();

        if (numDrawers > 0) {
            drawerCost = 2500 + ((numDrawers - 1) * 2000);
        } else {
            drawerCost = 0;
        }

        return additionalAreaCost + woodTypeCost + drawerCost;
    }

    // Getter method for drawerCost
    public int getDrawerCost() {
        return drawerCost;
    }
    // Getter method for area
    public int getArea() {
        return area;
    }

    // Calculate the area of the table
    private void calculateArea() {
        area = tableWidth * tableLength;
    }
}