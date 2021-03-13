package com.eknm;

public class Main {

    public static void main(String[] args) {
        int[] data = {0, 50, 100, 200, 500, 1000, 2000, 6000, 12000};
        for (int x = 0; x < 9; x++) {
            int n=data[x];
            int[][] a = new int[n][n];
            long s = System.currentTimeMillis();
            int bytes = n * n * 4 / 1024;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[i][j] = i * j;
                }
            }
            long e = System.currentTimeMillis();
            System.out.println("n=" + n + "\tbytes of array=" + bytes + " kb\tspent=" + (e - s) + " millis, Row-Major");
            s = System.currentTimeMillis();
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    a[j][i] = i * j;
                }
            }
            e = System.currentTimeMillis();
            System.out.println("n=" + n + "\tbytes of array=" + bytes + " kb\tspent=" + (e - s) + " millis,Column-Major");
        }
    }
}
