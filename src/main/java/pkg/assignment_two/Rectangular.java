package pkg.assignment_two;

abstract class Rectangular implements Shape {
    private int a, b;
    public Rectangular(int a) {
        this.a = a;
    }
    public Rectangular(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public double getSquare() {
        if (a > 0 && b == 0 || a == b) {
            return a * a;                       //Calculates area of square
        }
        else if (a > 0 && b > 0 && a != b) {
            return a * b;                       //Calculates area of rectangular shapes
        }
        else return 0;
    }
}
