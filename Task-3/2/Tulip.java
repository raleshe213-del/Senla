public class Tulip extends Flower{
    private static int count = 0;
    private static final int price = 100;

    Tulip(){}

    public void setCount(int count){
        Tulip.count = count;
    }

    public int getCount(){
        return Tulip.count;
    }

    public int price(){
        return Tulip.count * Tulip.price;
    }
}