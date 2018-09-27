package ro.jademy.carrental.Cars.Components;

import ro.jademy.carrental.Cars.Components.GearBoxParts.GBTypes;

public class GearBox {
    private GBTypes type;

    public GearBox (GBTypes type) {
        this.type = type;
    }

    public GBTypes getType() {
        return type;
    }
}
