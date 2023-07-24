package Esercizio_7;


import java.awt.*;

/**
 * The type Main.
 */
public class Main {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        Shape shape1 = new Shape();
        Shape shape2 = new Shape(5.0);
        Shape shape3 = new Shape(4, 6.0);
        Shape shape4 = new Shape(4, 10.0, 5.0);
        Shape shape5 = new Shape(3, 3.0, 4.0, 5.0);


        System.out.println("Shape 1 Details:\n" + shape1.getShapeDetails());
        System.out.println("Shape 2 Details:\n" + shape2.getShapeDetails());
        System.out.println("Shape 3 Details:\n" + shape3.getShapeDetails());
        System.out.println("Shape 4 Details:\n" + shape4.getShapeDetails());
        System.out.println("Shape 5 Details:\n" + shape5.getShapeDetails());
    }
}