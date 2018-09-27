package ro.jademy.carrental.cars.components.engine;

public enum Fuel {
    GASOLINE("Gasoline"), DIESEL("Diesel"), ELECTRIC("Electric"), MIX("Mix");

    private String fuelName;

    Fuel(String fuelName) {
        this.fuelName = fuelName;
    }

    public String getFuelName() {
        return fuelName;
    }
}
