public class Truck extends TransportEngine {

    public Truck(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Менянем покрышку у грузовика");
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
        checkTrailer();
    }

}
