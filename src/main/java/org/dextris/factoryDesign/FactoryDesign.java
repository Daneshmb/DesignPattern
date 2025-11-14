package org.dextris.factoryDesign;

public class FactoryDesign {

    public Shape getShape(String shape){
        if(shape==null){
            return null;
        } else if (shape.equalsIgnoreCase("circle")) {
            return new Circle();
        } else if (shape.equalsIgnoreCase("Square")) {
            return new Square();
        }
        return null;
    }
}
