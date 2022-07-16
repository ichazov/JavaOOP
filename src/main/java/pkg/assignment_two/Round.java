package pkg.assignment_two;

abstract class Round implements Shape {
    private int a, b;    //a - radius (r), b - radius (R)
    public Round(int a) {
        this.a = a;
    }
    public Round(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double getSquare() {
        if (a > 0 && b == 0 || a == b) {
            return cutDecimal(Math.PI * a * a);     //Calculates area of circle
        }
        else if (a > 0 && b > 0 && a != b) {
            return cutDecimal(Math.PI * a * b);     //Calculates area of oval
        }
        else return 0;
    }
    private double cutDecimal(double a) {
        return Math.round(a * 100.0) / 100.0;   //Returns max of 2 digits after decimal point
    }
}
