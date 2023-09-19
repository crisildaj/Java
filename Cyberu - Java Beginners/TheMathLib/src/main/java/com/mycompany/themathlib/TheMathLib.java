package com.mycompany.themathlib;

import java.lang.Math;

public class TheMathLib {

    public static void main(String[] args) {
        //double can represent much more larger numbers than a float
        double number = 4.321;
        number = Math.pow(number, 4.0);
        System.out.println(number);
    }
}
