public class Lemonade extends Drinks{

    /**вкус*/
    private String flavor;
    private static int titleNumber;
    static {
        Lemonade.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    уена
     * @param quantity количество
     * @param unit     единица измерения
     * @param volume   объем
     * @param taste    вкус
     */
    public Lemonade(String title, double price, short quantity, String unit, double volume, String taste) {
        super(title, price, quantity, unit, volume);
        this.flavor = taste;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Lemonade() {
        this(String.format("Lemonade#%d", ++Lemonade.titleNumber),
                r.nextDouble(), (short)r.nextInt(50), "liter",
                0.3, "mango");
    }

    @Override
    public String toString() {
        return String.format("%s Taste: %s;\n",
                super.toString(),
                this.flavor);
    }
}
