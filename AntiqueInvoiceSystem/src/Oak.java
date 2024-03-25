public class Oak extends Table {
    public Oak(int width, int length, int numDrawers) {
        super(width, length, "Oak", numDrawers);
    }

    // Implementation of woodPrice() for Oak table
    @Override
    public int woodPrice() {
        return 2015;
    }
}
