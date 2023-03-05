import java.util.Random;

public class FoodStuff extends Product{

    /**Срок годности*/
    private String shelfLive;
    private static final Random r = new Random();
    private static int titleNumber;
    static {
        FoodStuff.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title     название
     * @param price     цена
     * @param quantity  количество
     * @param unit      единица измерения
     * @param shelfLive срок годности
     */
    private FoodStuff(String title, double price, short quantity, String unit, String shelfLive) {
        super(title, price, quantity, unit);
        this.shelfLive = shelfLive;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public FoodStuff(){
        this(String.format("Food#%d", ++FoodStuff.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg", "09-05-2023");
    }


    @Override
    public String toString() {
        return String.format("%s Shelf Live: %s;\n",
                super.toString(),
                this.shelfLive);
    }
}
