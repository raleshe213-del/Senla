public class Rose extends Flower{
    private static int count = 0;
    private static final int price = 150;

    Rose(){}

    public void setCount(int count){
        Rose.count = count;
    }

    public int getCount(){
        return Rose.count;
    }

    public int price(){
        return Rose.count * Rose.price;
    }
}