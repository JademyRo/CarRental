package ro.jademy.carrental.Cars.Components.EngineParts;

public enum Fuels {
    GASOLINE("Gasoline"), DIESEL("Diesel"), ELECTRIC("Electric"), MIX("Mix");

    private String fuelName;

    Fuels(String fuelName) {
        this.fuelName = fuelName;
    }

    public String getFuelName() {
        return fuelName;
    }
}
