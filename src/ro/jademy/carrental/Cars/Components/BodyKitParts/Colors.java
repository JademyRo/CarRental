package ro.jademy.carrental.Cars.Components.BodyKitParts;

public enum Colors {
    WHITE("White"),
    BLACK("Black"),
    RED("Red"),
    YELLOW("Yellow"),
    SILVER("Silver"),
    BLUE("Blue"),
    DARKBLUE("Dark blue");

    private String color;

    Colors (String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
