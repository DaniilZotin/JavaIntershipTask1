package org.example.Ex3;

public class Bullet {
    private double R;
    public Bullet(double R) {
        this.R = R;
    }

    public double result()
    {
        return  Math.ceil(1.3*Math.PI*Math.pow(R, 3));
    }

}
