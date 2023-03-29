public class Car extends TransportEngine {

    public Car(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }
@Override
    public void check() {
        super.check();
        checkEngine();
    }
}

