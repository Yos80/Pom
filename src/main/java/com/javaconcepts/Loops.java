package com.javaconcepts;

public class Loops {

    public static void main(String[] args){

        //while loop , disadvantage : without initializing , can cause an infinite loop
        int i = 1; //initialization
        while(i<=10){ //declaration
            System.out.println(i);
            i++; //increment/decrement
        }

        System.out.println("*********************************************");

        for (int j = 1; j <= 10; j++){
            System.out.println(j);
        }

        System.out.println("*********************************************");

        int k = 10;
        int h = k++;
        System.out.println(k);
        System.out.println(h);

        int z = 10;
        int x = z--;
        System.out.println(x);
        System.out.println(z);

        int m = 10;
        int n = ++m;
        System.out.println(n);
        System.out.println(m);

        int a = 10;
        int s = --a;
        System.out.println(s);
        System.out.println(a);

    }

}
