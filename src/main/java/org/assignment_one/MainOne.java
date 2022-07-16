package org.assignment_one;

public class MainOne {
    public static void main(String[] args) {
        //Part 1
        Vector vector = new Vector(4,6,8);
        System.out.println(vector.lengthOfVectors());
        System.out.println("");

        System.out.println(vector.dotProduct(4,5,6));
        System.out.println("");

        System.out.println(vector.dotProduct());
    }
}