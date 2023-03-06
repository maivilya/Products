public class Pacifier extends ChildrenProducts {

    private String material;
    private static int titleNumber;
    static {
        Pacifier.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title    название
     * @param price    цена
     * @param quantity количество
     * @param unit     единица измерения
     * @param minAge   минимальный возраст
     * @param material материал
     */
    public Pacifier(String title, double price, short quantity, String unit,
                    byte minAge, String material) {
        super(title, price, quantity, unit, minAge);
        this.material = material;
        this.hyperallergenicity = false;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Pacifier() {
        this(String.format("Pacifier#%d", ++Pacifier.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "gram",
                (byte)r.nextInt(5), "rubber");
        this.hyperallergenicity = false;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return String.format("%s Material: %s;\n",
                super.toString(),
                this.material);
    }
}
