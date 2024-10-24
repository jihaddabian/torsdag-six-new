public class Square implements Shape {
    private double sideLength; // Sidelængde af kvadratet

    // Konstruktør til at initialisere sidelængden
    public Square(double sideLength) {
        this.sideLength = sideLength;
    }

    // Implementering af getArea metoden
    @Override
    public double getArea() {
        return sideLength * sideLength; // Areal = side²
    }
}
