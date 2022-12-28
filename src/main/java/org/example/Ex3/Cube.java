package org.example.Ex3;

public class Cube {
    private double side;
    public Cube(double side) {
        this.side = side;
    }

    public double result()
    {
        return Math.pow(side, 3);
    }

    
}
