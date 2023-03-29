public abstract class WheelsTransport implements Check{
    private String modelName;
    private int wheelsCount;

    public WheelsTransport(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }
    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

   public void check(){
           System.out.println("Обслуживаем " + getModelName());
           for (int i = 0; i < getWheelsCount(); i++) {
               updateTyre();
           }
       }
   }


