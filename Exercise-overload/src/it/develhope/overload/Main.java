package it.develhope.overload;

public class Main {
    public static void main(String[] args) {
        System.out.println("-------------------start-------------------");
        Shape circle = new Shape(15);
        Shape square = new Shape (4,12.5);
        Shape rectangle = new Shape(4,12,28.123);
        Shape triangle = new Shape (3,5,5,5);
        Shape undefined = new Shape();
        System.out.println(circle.getShapeDetails());
        System.out.println("---------------------------------------");
        System.out.println(square.getShapeDetails());
        System.out.println("---------------------------------------");
        System.out.println(rectangle.getShapeDetails());
        System.out.println("---------------------------------------");
        System.out.println(triangle.getShapeDetails());
        System.out.println("---------------------------------------");
        System.out.println(undefined.getShapeDetails());

    }
}