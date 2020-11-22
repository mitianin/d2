package com.company;

public class Circle {
    private Point center = new Point();
    private int rad;

    public Circle(Point center, int rad) {
        this.center = center;
        this.rad = rad;
    }

    public Circle() {
    }

    public Point getCenter() {
        return center;
    }

    public int getRad() {
        return rad;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRad(int rad) {
        this.rad = rad;
    }

    boolean isContains(Point p) {

        return Math.sqrt(Math.pow((p.getX() - center.getX()), 2) + Math.pow((p.getY() - center.getY()), 2)) < rad;

    }
}
