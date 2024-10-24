import java.util.ArrayList; // Importer ArrayList
import java.util.List; // Importer List

public class ShapeBuilder {
    private List<Shape> shapes; // Liste til at holde figurer

    // Konstruktør til at initialisere listen
    public ShapeBuilder() {
        shapes = new ArrayList<>();
    }

    // Metode til at tilføje en figur til listen
    public void addShape(Shape s) {
        shapes.add(s);
    }

    // Metode til at beregne det samlede areal
    public double getTotalArea() {
        double totalArea = 0.0; // Variabel til at holde det samlede areal
        for (Shape shape : shapes) { // Gå gennem alle figurer
            totalArea += shape.getArea(); // Tilføj arealet af hver figur
        }
        return totalArea; // Returner det samlede areal
    }
}
