public class Main {
    public static void main(String[] args) {
        System.out.println("Starting building a tank");
        new Tank().assemble_tank(new Chassis(), new Turret(), new Track());
    }
}
