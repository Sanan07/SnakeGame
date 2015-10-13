package com.company;

import java.util.Scanner;

public class Main {


    static int k,n,two,one;

    static Scanner scanner = new Scanner(System.in);

    static long l;

    public static void main(String[] args) {


        for (int i = 0; i < 200; i++) {
            System.out.println(i);
            System.out.println(i*i);
        }

    }

    static int gcd(int a, int b)
    {
        return (b == 0) ? a : gcd(b, a%b);
    }

    static int nok(int a, int b)
    {
        return a*b/gcd(a, b);
    }

    static int max(int [] a,int i) {

        int maxx = Integer.MIN_VALUE;

        for (int j = i + 1; j < a.length; j++) {

            if (a[j] > maxx) {

                maxx = a[j];

            }

        }



        return maxx;
    }


}
