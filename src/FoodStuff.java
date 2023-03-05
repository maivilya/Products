import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Random;

public class FoodStuff extends Product{

    /**Срок годности*/

    private Calendar calendar;
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
     */
    public FoodStuff(String title, double price, short quantity, String unit) {
        super(title, price, quantity, unit);
        this.calendar = new GregorianCalendar(2023, 3, 25);
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public FoodStuff(){
        this(String.format("Food#%d", ++FoodStuff.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "kg");
    }


    @Override
    public String toString() {
        return String.format("%s Shelf Live: %s-%s-%s;\n",
                super.toString(),
                this.calendar.get(Calendar.YEAR),
                this.calendar.get(Calendar.MONTH),
                this.calendar.get(Calendar.DAY_OF_MONTH));
    }
}
