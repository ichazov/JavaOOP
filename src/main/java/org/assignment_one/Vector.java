package org.assignment_one;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Vector {
    private final int x, y, z;
    private static final List<int[]> coordinatesSet = new ArrayList<>(2);
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
        generateCoordinates();

        int x1 = coordinatesSet.get(0)[0];
        int y1 = coordinatesSet.get(0)[1];
        int z1 = coordinatesSet.get(0)[2];
        int x2 = coordinatesSet.get(1)[0];
        int y2 = coordinatesSet.get(1)[1];
        int z2 = coordinatesSet.get(1)[2];

        return x1 * x2 + y1 * y2 + z1 * z2;
    }
    int dotProduct(int a, int b, int c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            return 0;
        }
        return x * a + y * b + z * c;
    }
    private static void generateCoordinates() {
        Random random = new Random();
        for (int j = 0; j < 2; j++) {
            int[] coordinates = new int[3];
            for (int i = 0; i < coordinates.length; i++) {
                int r = random.nextInt(1,9);
                coordinates[i] = r;
            }
            coordinatesSet.add(coordinates);
        }
    }
}