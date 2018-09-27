package ro.jademy.carrental.Cars.Components;

import ro.jademy.carrental.Cars.Components.BodyKitParts.*;

public class BodyKit {

    private String chassisNo;
    private BodyKitTypes type;
    private Colors color;
    private Doors doors;

    public BodyKit(String chassisNo, Colors color, BodyKitTypes type, Doors doors) {
        this.chassisNo = chassisNo;
        this.color = color;
        this.type = type;
        this.doors = doors;
    }

    public String getChassisNo () {
        return chassisNo;
    }

    public BodyKitTypes getType() {
        return type;
    }

    public Colors getColor() {
        return color;
    }

    public Doors getDoors() {
        return doors;
    }
}
