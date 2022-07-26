package pkg.assignment_two;

class Rectangle extends Rectangular {
    public Rectangle(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare() {
        if (a > 0 && b > 0) {
            return a * b;
        } else return 0;
    }
}
