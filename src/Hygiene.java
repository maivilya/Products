public class Hygiene extends Product{

    /**количество в упаковке*/
    private byte quantityPerPackage;
    private static int titleNumber;
    static {
        Hygiene.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title       название
     * @param price       цена
     * @param quantity    количество
     * @param unit        единица измерения
     * @param quanPerPack количество в упаковке
     */
    public Hygiene(String title, double price, short quantity, String unit, byte quanPerPack) {
        super(title, price, quantity, unit);
        this.quantityPerPackage = quanPerPack;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Hygiene() {
        this(String.format("Hygiene#%d", ++Hygiene.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "pieces",
                (byte) r.nextInt(2));
    }

    @Override
    public String toString() {
        return String.format("%s Quantity in package: %d%s;\n",
                super.toString(),
                this.quantityPerPackage,
                "pieces");
    }
}
