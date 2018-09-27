package ro.jademy.carrental.Cars.Components.BodyKitParts;

public enum BodyKitTypes {
    SEDAN("Sedan"),
    COUPE("Coupe"),
    HATCHBACK("Hatchback"),
    CONVERTIBLE("Convertible"),
    WAGON("Convertible"),
    SUV("SUV");

    private String bodyKit;

    BodyKitTypes(String bodyKit) {
        this.bodyKit = bodyKit;
    }

    public String getBodyKit() {
        return bodyKit;
    }
}
