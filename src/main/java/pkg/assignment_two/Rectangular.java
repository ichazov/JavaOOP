package pkg.assignment_two;

abstract class Rectangular implements Shape {
    protected int a, b;
    protected Rectangular() {    }
    public double getSquare() {
        if (a > 0) {
            return a * a;
        }
        else return 0;
    }
}