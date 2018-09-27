package ro.jademy.carrental.cars.components.bodykit;

public enum ColorType {
    WHITE("White"),
    BLACK("Black"),
    RED("Red"),
    YELLOW("Yellow"),
    SILVER("Silver"),
    BLUE("Blue"),
    DARKBLUE("Dark blue");

    private String color;

    ColorType(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
