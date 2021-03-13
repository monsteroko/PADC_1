package com.eknm;

public class Pt3 {
    public static void main(String[] args) {
        long s = System.currentTimeMillis();
        for (int i = 0; i < 10_000_000; i++) {
            long aElement=i;
            Math.abs(i);
        }
        long e = System.currentTimeMillis();
        System.out.println("1st time spent=" + (e - s) + " millis");
        s = System.currentTimeMillis();
        long aElement=0;
        for (int i = 0; i < 10_000_000; i++) {
            Math.abs(i);
        }
        e = System.currentTimeMillis();
        System.out.println("2nd time spent=" + (e - s) + " millis");
    }
}
