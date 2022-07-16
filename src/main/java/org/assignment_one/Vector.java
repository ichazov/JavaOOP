package org.assignment_one;

import java.util.ArrayList;
import java.util.Random;

class Vector {
    private int x, y, z;
    private static ArrayList<Integer> vectors = new ArrayList<>();
    public Vector(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double lengthOfVectors() {
        if (x <= 0 || y <= 0 || z <= 0) {
            return 0;
        }
        double result = Math.sqrt(x * x + y * y + z * z);   //Length of 3D Vectors
        return Math.round(result * 100.0) / 100.0;
    }
    int dotProduct() {
        if (x <= 0 || y <= 0 || z <= 0) {
            return 0;
        }
        listOfVectors();
        return x * vectors.get(0) + y * vectors.get(1) + z * vectors.get(2);
    }
    int dotProduct(int x1, int y1, int z1) {
        if (x <= 0 || y <= 0 || z <= 0) {
            return 0;
        }
        return x * x1 + y * y1 + z * z1;
    }
    private static void listOfVectors () {
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            vectors.add(random.nextInt(1,9));
        }
    }
}

