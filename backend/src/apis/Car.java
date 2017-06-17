package apis;

/**
 * Created by Admin on 17/06/2017.
 */
public class Car {
    private boolean plugged;
    private String name;
    private String engineModel;
    private String engineCondition;
    private String brakeModel;
    private String brakeCondition;
    private int tirePressure;

    public Car(boolean plugged) {
        this.plugged = plugged;
    }

    public Car(boolean plugged, String name, String engineModel, String engineCondition, String brakeModel,
               String brakeCondition, int tirePressure) {
        this.plugged = plugged;
        this.name = name;
        this.engineModel = engineModel;
        this.engineCondition = engineCondition;
        this.brakeModel = brakeModel;
        this.brakeCondition = brakeCondition;
        this.tirePressure = tirePressure;
    }

    public boolean isPlugged() {
        return plugged;
    }

    public void setPlugged(boolean plugged) {
        this.plugged = plugged;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEngineModel() {
        return engineModel;
    }

    public void setEngineModel(String engineModel) {
        this.engineModel = engineModel;
    }

    public String getEngineCondition() {
        return engineCondition;
    }

    public void setEngineCondition(String engineCondition) {
        this.engineCondition = engineCondition;
    }

    public String getBrakeModel() {
        return brakeModel;
    }

    public void setBrakeModel(String brakeModel) {
        this.brakeModel = brakeModel;
    }

    public String getBrakeCondition() {
        return brakeCondition;
    }

    public void setBrakeCondition(String brakeCondition) {
        this.brakeCondition = brakeCondition;
    }

    public int getTirePressure() {
        return tirePressure;
    }

    public void setTirePressure(int tirePressure) {
        this.tirePressure = tirePressure;
    }
}