package it.develhope.overload;

public class Shape {
    public String shapeName;
    public int numberOfEdges;

    public Shape(){
        System.out.println("A new shape has been created");
        shapeName = "Undefined Shape";
    }
    public Shape(double radius){
        System.out.println("A new circle has been created");
        shapeName="Circle";
    }

    public Shape(int edges,double edgeLength){
        System.out.println("A new square has been created");
        shapeName="Square";
        numberOfEdges = edges;
    }
    public Shape(int edges,double e1,double e2){
        System.out.println("A new rectangle has been created");
        shapeName="Rectangle";
        numberOfEdges=edges;
    }
    public Shape(int edges,double e1, double e2, double e3){
        System.out.println("A new triangle has been created");
        shapeName="Triangle";
        numberOfEdges = edges;
    }
    public String getShapeDetails(){
        return "This shape is a " + shapeName + " and has " + numberOfEdges + " edges";
    }
}
