import java.util.Random;

public class Product {
    private String title;
    private double price;
    private short quantity;
    private final String unit;
    protected final static Random r = new Random();
    private static int titleNumber;
    static {
        Product.titleNumber = 0;
    }


    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    цена
     * @param quantity количество
     * @param unit     единица измерения
     */
    public Product(String title, double price, short quantity, String unit) {
        this.title = title;
        this.price = price;
        this.quantity = quantity;
        this.unit = unit;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Product() {
        this(String.format("Title#%d", ++Product.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg");

    }

    @Override
    public String toString() {
        return String.format("%s %s:\n Price: %.2f$;\n Quantity: %d;\n",
                this.getClass().getSimpleName(),
                this.title,
                this.price,
                this.quantity);
    }
}
