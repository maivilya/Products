public class ChildrenProducts extends Product{

    private byte minAge;
    protected boolean hyperallergenicity;
    private static int titleNumber;
    static {
        ChildrenProducts.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    цена
     * @param quantity количество
     * @param unit     единица измерения
     * @param minAge   минимальный возраст
     */
    public ChildrenProducts(String title, double price, short quantity,
                            String unit, byte minAge) {
        super(title, price, quantity, unit);
        this.minAge = minAge;
        this.hyperallergenicity = false;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public ChildrenProducts() {
        this(String.format("Toy#%d", ++ChildrenProducts.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "gram",
                (byte)r.nextInt(5));
        this.hyperallergenicity = false;
    }

    public void setMinAge(byte minAge) {
        this.minAge = minAge;
    }

    public void setHyperallergenicity(boolean hyperallergenicity) {
        this.hyperallergenicity = hyperallergenicity;
    }

    @Override
    public String toString() {
        return String.format("%s Minimal Age to use: %d;\n Hyperallergenicity: %b;\n",
                super.toString(),
                this.minAge,
                this.hyperallergenicity);
    }
}
