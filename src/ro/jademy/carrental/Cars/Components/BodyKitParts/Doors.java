package ro.jademy.carrental.Cars.Components.BodyKitParts;

public enum Doors {
    TWO(2),
    FOUR(4),
    SIX(6);

    private final Integer numberOfDoors;

    Doors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfDoors() {
        return numberOfDoors.intValue();
    }

    @Override
    public String toString() {
        return "numberOfDoors";
    }
}
