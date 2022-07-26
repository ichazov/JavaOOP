package pkg.assignment_two;

class Oval extends Round {
    public Oval(int a, int b) {
        super();
        this.a = a;
        this.b = b;
    }
    @Override
    public double getSquare() {
        if (a > 0 && b > 0) {
            return cutDecimal(Math.PI * a * b);
        } else return 0;
    }
}