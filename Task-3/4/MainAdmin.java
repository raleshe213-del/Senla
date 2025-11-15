public class MainAdmin {
    static Room[] rooms = new Room[4];
    static Service[] services = new Service[3];

    static{
        services[0] = new Service(SERVICES.CLEANING, 250);
        services[1] = new Service(SERVICES.COOKING, 350);
        services[2] = new Service(SERVICES.BREAKFASTING, 450);
        rooms[0] = new Room(1, 500, services);
        rooms[1] = new Room(2, 700, services);
        rooms[2] = new Room(3, 550, services);
        rooms[3] = new Room(4, 1000, services);
    }
    public static void main(String[] args){
        Administrate admin = new Administrate();
        Person bob = new Person("Bob", 21);
        Person alice = new Person("Alice", 19);
        Person jack = new Person("Jack", 25);
        admin.get_in_room(alice, rooms[0]);
        admin.change_state(rooms[0], ROOM_STATUS.OCCUPIED);
        admin.get_in_room(bob, rooms[1]);
        admin.change_state(rooms[1], ROOM_STATUS.OCCUPIED);
        admin.out_room(rooms[0]);
        admin.change_state(rooms[0], ROOM_STATUS.VACANT);
    }
}
