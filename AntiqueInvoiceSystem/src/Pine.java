public class Pine extends Table {
    public Pine(int width, int length, int numDrawers) {
        super(width, length, "Pine", numDrawers);
    }

    // Implementation of woodPrice() for Pine table
    @Override
    public int woodPrice() {
        return 0;
    }
}
