package pkg.assignment_two;

public class MainTwo {
    public static void main(String[] args) {
        //Part 2
        Square sq = new Square(5);
        System.out.println(sq.getSquare());
        System.out.println("");

        Rectangle rct = new Rectangle(6,7);
        System.out.println(rct.getSquare());
        System.out.println("");

        Circle circle = new Circle(6);
        System.out.println(circle.getSquare());
        System.out.println("");

        Oval oval = new Oval(4,6);
        System.out.println(oval.getSquare());
        System.out.println("");
    }
}
