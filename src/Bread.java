public class Bread extends FoodStuff{

    /**тип муки*/
    private String flourType;
    private static int titleNumber;

    static {
        Bread.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title     название
     * @param price     цена
     * @param quantity  количество
     * @param unit      единица измерения
     * @param flourType типа муки
     */
    public Bread(String title, double price, short quantity, String unit, String flourType) {
        super(title, price, quantity, unit);
        this.flourType = flourType;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Bread() {
        this(String.format("Bread#%d", ++Bread.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg", "wheat");
    }

    @Override
    public String toString() {
        return String.format("%s Flour Type: %s;\n",
                super.toString(),
                this.flourType);
    }
}
