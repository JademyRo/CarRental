package ro.jademy.carrental.Cars.Components;

import ro.jademy.carrental.Cars.Components.EngineParts.*;

public class Engine {

    private String model;
    private String horsePower;
    private Fuels fuel;

    public Engine(String model, String horsePower, Fuels fuel) {
        this.model = model;
        this.horsePower = horsePower;
        this.fuel = fuel;
    }

    public String getModel() {
        return model;
    }

    public String getHorsePower() {
        return horsePower;
    }

    public Fuels getFuel() {
        return fuel;
    }
}
