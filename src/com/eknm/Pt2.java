package com.eknm;

import java.util.ArrayList;
import java.util.LinkedList;

public class Pt2 {
    public static void main(String[] args) {
        int[] data = {0, 50, 100, 200, 500, 1000, 2000, 6000, 12000};
        for (int x = 0; x < 9; x++) {
            int n=data[x];
            double array[] = new double[n];
            long s = System.currentTimeMillis();
            for (int i=0;i<n;i++)
                array[i]=i;
            double sum1=0;
            for (int i=0;i<n;i++)
                sum1+=array[i];
            long e = System.currentTimeMillis();
            System.out.println("n=" + n + "\tspent=" + (e - s) + " millis, array[]");

            LinkedList<Double> linked_list = new LinkedList<Double>();
            s = System.currentTimeMillis();
            for (int i=0;i<n;i++)
                linked_list.add(new Double(i));
            double sum2=0;
            for (int i=0;i<n;i++)
                sum2+=linked_list.get(i);
            e = System.currentTimeMillis();
            System.out.println("n=" + n + "\tspent=" + (e - s) + " millis, LinkedList<>");

            ArrayList<Double> array_list = new ArrayList<Double>(n);
            s = System.currentTimeMillis();
            for (int i=0;i<n;i++)
                array_list.add(new Double(i));
            double sum3=0;
            for (int i=0;i<n;i++)
                sum3+=array_list.get(i);
            e = System.currentTimeMillis();
            System.out.println("n=" + n + "\tspent=" + (e - s) + " millis, ArrayList<>");
        }
    }
}
