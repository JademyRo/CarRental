package ro.jademy.carrental.cars.components.gearbox;

public enum GBType {
    MANUAL("Manual"),
    AUTOMATIC("Automatic"),
    SWITCHABLE("Swichable");

    private String transmission;

    GBType(String transmission) {
        this.transmission = transmission;
    }

    public String getTransmission() {
        return transmission;
    }
}
