public class Mahogany extends Table {
    public Mahogany(int width, int length, int numDrawers) {
        super(width, length, "Mahogany",numDrawers);
    }

    // Implementation of woodPrice() for Mahogany table
    @Override
    public int woodPrice() {
        return 3000;
    }
}
