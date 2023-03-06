import java.util.Calendar;
import java.util.GregorianCalendar;

public class Drinks extends Product{

    /**объем*/
    private double volume;
    private Calendar calendar;
    private static int titleNumber;
    static {
        Drinks.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    уена
     * @param quantity количество
     * @param unit     единица измерения
     * @param volume   объем
     */
    public Drinks(String title, double price, short quantity, String unit, double volume) {
        super(title, price, quantity, unit);
        this.calendar = new GregorianCalendar(2023,3, 25);
        this.volume = volume;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Drinks() {
        this(String.format("Drinks#%d", ++Drinks.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "liters",
                r.nextDouble());

    }

    @Override
    public String toString() {
        return String.format("%s Volume: %.2f %s;\n Shelf Live: %s-%s-%s;\n",
                super.toString(),
                this.volume,
                "liters",
                this.calendar.get(Calendar.YEAR),
                this.calendar.get(Calendar.MONTH),
                this.calendar.get(Calendar.DAY_OF_MONTH));
    }
}
