package ro.jademy.carrental.Cars.Components.GearBoxParts;

public enum GBTypes {
    MANUAL("Manual"),
    AUTOMATIC("Automatic"),
    SWITCHABLE("Swichable");

    private String transmission;

    GBTypes (String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }
}
