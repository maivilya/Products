import java.util.Random;

public class DairyProduct extends FoodStuff {

    protected String type;
    private final static Random r = new Random();
    private static int titleNumber;

    static {
        DairyProduct.titleNumber = 0;
    }


    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    цена
     * @param quantity количество
     * @param unit     единица измерения
     */
    public DairyProduct(String title, double price, short quantity, String unit) {
        super(title, price, quantity, unit);
        this.type = "type";
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public DairyProduct() {
        this(String.format("Dairy#%d", ++DairyProduct.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg");
    }

    @Override
    public String toString() {
        return String.format("%s Type: %s;\n",
                super.toString(),
                this.type);
    }
}
