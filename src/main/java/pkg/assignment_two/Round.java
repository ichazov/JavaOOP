package pkg.assignment_two;

abstract class Round implements Shape {
    protected int a, b;     //a - radius (r), b - radius (R)
    public double getSquare() {
        if (a > 0) {
            return cutDecimal(Math.PI * a * a);
        }
        else return 0;
    }
    protected double cutDecimal(double a) {
        return Math.round(a * 100.0) / 100.0;   //Returns max of 2 digits after decimal point
    }
}