package Esercizio_7;

/**
 * The type Shape.
 */
public class Shape {
    private String shapeName;
    private int numberOfEdges;

    /**
     * Instantiates a new Shape.
     */
    public Shape() {
        this.shapeName = "Undefined shape";
        System.out.println("Oggetto Shape creato.");
    }

    /**
     * Instantiates a new Shape.
     *
     * @param radius the radius
     */
    public Shape(double radius) {
        this.shapeName = "Circle";
        this.numberOfEdges = 0;
        System.out.println("Oggetto Circle creato.");
    }

    /**
     * Instantiates a new Shape.
     *
     * @param edges      the edges
     * @param edgeLength the edge length
     */
    public Shape(int edges, double edgeLength) {
        this.shapeName = "Square";
        this.numberOfEdges = edges;
        System.out.println("Oggetto Square creato.");
    }

    /**
     * Instantiates a new Shape.
     *
     * @param edges the edges
     * @param e1    the e 1
     * @param e2    the e 2
     */
    public Shape(int edges, double e1, double e2) {
        this.shapeName = "Rectangle";
        this.numberOfEdges = edges;
        System.out.println("Oggetto Rectangle creato.");
    }

    /**
     * Instantiates a new Shape.
     *
     * @param edges the edges
     * @param e1    the e 1
     * @param e2    the e 2
     * @param e3    the e 3
     */
    public Shape(int edges, double e1, double e2, double e3) {
        this.shapeName = "Triangle";
        this.numberOfEdges = edges;
        System.out.println("Oggetto Triangle creato.");
    }

    /**
     * Gets shape details.
     *
     * @return the shape details
     */
    public String getShapeDetails() {
        return "Shape Name: " + shapeName + "\nNumber Of Edges: " + numberOfEdges;
    }
}