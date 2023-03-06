public class ToiletPaper extends Hygiene{

    /**количество слоев*/
    private byte layersNumber;
    private static int titleNumber;
    static {
        ToiletPaper.titleNumber = 0;
    }

    /**
     * Параметризированный конструктор:
     * @param title       название
     * @param price       цена
     * @param quantity    количество
     * @param unit        единица измерения
     * @param quanPerPack количество в упаковке
     * @param layers      количество слоев
     */
    public ToiletPaper(String title, double price, short quantity,
                       String unit, byte quanPerPack, byte layers) {
        super(title, price, quantity, unit, quanPerPack);
        this.layersNumber = layers;
    }

    /**
     * Конструктор, создающий продукт по умолчанию.
     */
    public ToiletPaper() {
        this(String.format("ToiletPaper#%d", ++ToiletPaper.titleNumber),
                r.nextDouble(), (short) r.nextInt(50), "pieces",
                (byte) r.nextInt(2), (byte)r.nextInt(3));
    }

    public void setLayersNumber(byte layersNumber) {
        this.layersNumber = layersNumber;
    }

    @Override
    public String toString() {
        return String.format("%s Layers: %d;\n",
                super.toString(),
                this.layersNumber);
    }
}
