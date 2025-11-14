package org.dextris.factoryDesign;

public class MainClass {

    public static void main(String[] args) {
        FactoryDesign factoryDesign=new FactoryDesign();

        Shape shape=factoryDesign.getShape("circle");
        shape.draw();
        Shape shape1=factoryDesign.getShape("Square");
        shape1.draw();
    }
}
