package org.example.Ex3;

public class Culindr extends Figure {
    private double radius,height;
    public Culindr(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

    public double result()
    {

        return  Math.ceil(Math.PI*Math.pow(radius, 2) * height);
    }
    
}
