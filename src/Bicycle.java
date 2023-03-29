public class Bicycle extends WheelsTransport {

    public Bicycle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void updateTyre() {
        System.out.println("Менянем покрышку у велосипеда");
    }

    @Override
    public void check() {
        super.check();
    }
}
