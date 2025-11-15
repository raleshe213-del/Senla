public class Shop{
    public static void main(String[] args) {
        System.out.println("Creating a bouquet");
        System.out.println("With 3 roses, 2 tulips and 4 lilies");
        Rose rose = new Rose();
        Tulip tulip = new Tulip();
        Lily lily = new Lily();
        rose.setCount(3);
        lily.setCount(4);
        tulip.setCount(2);
        System.out.println("Total price = " + (rose.price() + tulip.price() + lily.price()));
    }
}