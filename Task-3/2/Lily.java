public class Lily extends Flower{
    private static int count = 0;
    private static final int price = 250;

    Lily(){}

    public  void setCount(int count){
        Lily.count = count;
    }

    public int getCount(){
        return Lily.count;
    }

    public int price(){
        return Lily.count * Lily.price;
    }
}