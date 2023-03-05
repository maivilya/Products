import java.util.Random;

public class DairyProduct extends FoodStuff {

    private final String type;
    private final static Random r = new Random();
    private static int titleNumber;

    static {
        DairyProduct.titleNumber = 0;
    }


    public DairyProduct(String title, double price, short quantity, String unit, String type) {
        super(title, price, quantity, unit);
        this.type = type;
    }

    public DairyProduct() {
        this(String.format("Dairy#%d", ++DairyProduct.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg","liquid");
    }

    @Override
    public String toString() {
        return String.format("%s Type: %s;\n", super.toString(), this.type);
    }
}
