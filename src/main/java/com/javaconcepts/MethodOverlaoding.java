package com.javaconcepts;

public class MethodOverlaoding {

    //We cannot create 2 (or more) methods (either separate or method inside method) with the same name and same input param
    //method overloading -> when method name is the same BUT with different arguments/input params/data types

    public void sum(){ //0 input param
        System.out.println("SUM method -- zero param");
    }
    public void sum(int i){ //1 input param
        System.out.println("SUM method -- 1 input  param");
        System.out.println(i);
    }
    public void sum(int z , int x){ //2 input param
        System.out.println("SUM method -- 2 input  param");
        System.out.println(z+x);
    }

    public static void main(String[] args){

        //methods are non-static so ill need an object
        MethodOverlaoding obj = new MethodOverlaoding();
        obj.sum();
        obj.sum(3);
        obj.sum(8,9);
    }
}
