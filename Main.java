public class Main {
    public static void main(String[] args) {
        // Opret figurer
        Circle circle = new Circle(5.0); // Opret en cirkel med radius 5.0
        Square square = new Square(4.0);  // Opret et kvadrat med sidelængde 4.0

        // Opret ShapeBuilder og tilføj figurer
        ShapeBuilder shapeBuilder = new ShapeBuilder();
        shapeBuilder.addShape(circle); // Tilføj cirklen til builderen
        shapeBuilder.addShape(square);  // Tilføj kvadratet til builderen

        // Hent og print samlet areal
        double totalArea = shapeBuilder.getTotalArea(); // Beregn samlet areal
        System.out.println("Samlet areal af figurer: " + totalArea); // Print samlet areal
    }
}
