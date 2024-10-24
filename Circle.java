public class Circle implements Shape {
    private double radius; // Radius af cirklen

    // Konstruktør til at initialisere radius
    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementering af getArea metoden
    @Override
    public double getArea() {
        return Math.PI * radius * radius; // Areal = π * r²
    }
}
