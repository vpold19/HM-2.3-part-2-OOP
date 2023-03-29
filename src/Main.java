public class Main {
    public static void main(String[] args) {
        Car car = new Car("car1", 4);
        Car car2 = new Car("car2", 4);

        Truck truck = new Truck("truck1", 6);
        Truck truck2 = new Truck("truck2", 8);

        Bicycle bicycle = new Bicycle("bicycle1", 2);
        Bicycle bicycle2 = new Bicycle("bicycle2", 2);


        ServiceStation station = new ServiceStation();

        station.checkTransport(truck);
        System.out.println();
        station.checkTransport(truck2);
        System.out.println();
        station.checkTransport(car);
        System.out.println();
        station.checkTransport(car2);
        System.out.println();
        station.checkTransport(bicycle);
        System.out.println();
        station.checkTransport(bicycle2);
    }
}