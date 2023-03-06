import java.util.ArrayList;
import java.util.Iterator;

public class Program {
    public static void main(String[] args) {

        ArrayList<Product> products = new ArrayList<>(12);
        products.add(new Bread());
        products.add(new Bread("Borodinskiy", 0.99, (short) 100, "gram", "Whole wheat"));
        products.add(new ChildrenProducts());
        products.add(new ChildrenProducts("Car toy", 2.55, (short) 25, "gram", (byte) 5));
        products.add(new DairyProduct());
        products.add(new DairyProduct("Tvorog", 1.29, (short) 45, "gram"));
        products.add(new Diaper());
        products.add(new Diaper("Super Diaper", 20.35, (short)15, "gram", (byte)0, "min M",
                (byte) 1, (byte) 10, "for growing children"));
        products.add(new Drinks());
        products.add(new Drinks("Juice", 3.99, (short)25, "litres", 2));
        products.add(new FoodStuff());
        products.add(new FoodStuff("Cat's food", 2.55, (short)200, "gram"));
        products.add(new Hygiene());
        products.add(new Hygiene("Toothpaste", 4.99, (short)150,"gram", (byte)2));
        products.add(new Lemonade());
        products.add(new Lemonade("Lyrical Lemonade", 99.99, (short)5, "millilitres",
                0.7, "Water melon"));
        products.add(new Milk());
        products.add(new Milk("Coconut Milk", 1.99, (short)70, "millilitres", (byte)5));
        products.add(new Pacifier());
        products.add(new Pacifier("Super pacifier", 20.99, (short)40, "gram", (byte)1, "soft"));
        products.add(new ToiletPaper());
        products.add(new ToiletPaper("Papia", 4.00, (short)100, "gram", (byte)8, (byte)3));
        products.add(new Product());
        products.add(new Product("Potato", 0.79, (short)30, "kg"));

        Iterator<Product> productIterator = products.iterator();
        while(productIterator.hasNext()){
            System.out.println(productIterator.next());
        }
    }


}