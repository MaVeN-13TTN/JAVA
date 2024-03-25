// Mahogany table class
public class Mahogany extends Table {
    // Constructor
    public Mahogany(int width, int length, int numDrawers) {
        super(width, length, numDrawers);
    }

    // Implementation of woodPrice() for Mahogany table
    @Override
    public int woodPrice() {
        return 3000;
    }

    // Implementation of calculateBasePrice() for Mahogany table
    @Override
    public int calculateBasePrice() {
        return 42500;
    }

    // Implementation of calculateTotalCost() for Mahogany table
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
