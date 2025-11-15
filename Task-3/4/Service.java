public class Service {
    private SERVICES name;
    private int cost;

    public Service(SERVICES name, int cost){
        this.name = name;
        this.cost = cost;
    }

    public Service(){
        this.name = SERVICES.CLEANING;
        this.cost = 0;
    }

    public SERVICES get_name(){
        return name;
    }
    public int get_cost(){
        return cost;
    }
    public void set_name(SERVICES name){
        this.name = name;
    }
    public void set_cost(int cost){
        this.cost = cost;
    }

}
