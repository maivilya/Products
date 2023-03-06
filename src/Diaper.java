public class Diaper extends ChildrenProducts {

    private String size;
    private byte minWeight;
    private byte maxWeight;
    private String type;

    private static int titleNumber;
    static {
        Diaper.titleNumber = 0;
    }


    /**
     * Параметризированный конструктор:
     * @param title     название
     * @param price     цена
     * @param quantity  количество
     * @param unit      единица измерения
     * @param minAge    минимальный возраст
     * @param size      размер
     * @param minWeight минимальный вес
     * @param maxWeight максимальный вес
     * @param type      тип подгузников
     */
    public Diaper(String title, double price, short quantity, String unit, byte minAge,
                  String size, byte minWeight, byte maxWeight, String type) {
        super(title, price, quantity, unit, minAge);
        this.size = size;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
        this.type = type;
        this.hyperallergenicity = false;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public Diaper() {
        this(String.format("Diaper#%d", ++Diaper.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "pieces",
                (byte)r.nextInt(5), "minimal S",(byte)2,
                (byte) 6, "for child's");
        this.hyperallergenicity = false;
    }

    public void setMinWeight(byte minWeight) {
        this.minWeight = minWeight;
    }

    public void setMaxWeight(byte maxWeight) {
        this.maxWeight = maxWeight;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("%s Size: %s;\n Minimal Weight to use: %d;\n Maximal Weight to use: %d;\n Type: %s;\n",
                super.toString(),
                this.size,
                this.minWeight,
                this.maxWeight,
                this.type);
    }
}
