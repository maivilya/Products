import java.util.Random;

public class Milk extends DairyProduct{

    /**жирность*/
    private byte fatness;
    private static int titleNumber;

    static {
        Milk.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    уена
     * @param quantity количество
     * @param unit     единица измерения
     * @param fat      процент жирности
     */
    public Milk(String title, double price, short quantity, String unit, byte fat) {
        super(title, price, quantity, unit);
        this.type = "liquid";
        this.fatness = fat;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Milk() {
        this(String.format("Milk#%d", ++Milk.titleNumber),
                r.nextDouble(), (short) r.nextInt(50),
                "liter",(byte) r.nextInt(20));
    }

    @Override
    public String toString() {
        return String.format("%s Fatness: %d%s\n",
                super.toString(),
                this.fatness,
                "%;");
    }
}
