// Pine table class
public class Pine extends Table {
    // Constructor
    public Pine(int width, int length, int numDrawers) {
        super(width, length, numDrawers);
    }

    // Implementation of woodPrice() for Pine table
    @Override
    public int woodPrice() {
        return 0; // No extra cost for Pine
    }

    // Implementation of calculateBasePrice() for Pine table
    @Override
    public int calculateBasePrice() {
        return 42500;
    }

    // Implementation of calculateTotalCost() for Pine table
    @Override
    public int calculateTotalCost() {
        int standardArea = 80 * 120;
        int areaDifference = getArea() - standardArea;
        int additionalAreaCost = areaDifference * 825;

        int woodTypeCost = woodPrice();

        if (numDrawers > 0) {
            return additionalAreaCost + woodTypeCost + getDrawerCost();
        } else {
            return additionalAreaCost + woodTypeCost;
        }
    }
}
