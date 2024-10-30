/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.javase.ch4;

/**
 *
 * @author May Thagyan
 */
public class DivisionOperator {

    public static void main(String[] args) {
        int a = 5;
        int b = 2;
        System.out.println("a/b (int divisoin) " + a / b);
        System.out.println("a/2.0 (float division) " + a / 2.0);
        //System.out.println("2/0 (error divided by zero) " + 2/0);// this error happen int division
        System.out.println("2/0.0 " + 2 / 0.0);// infinity 
        System.out.println("0.0/0.0 " + 0.0 / 0.0);//NaN(Not a Number)
        double result = 0.0 / 0.0;
        System.out.println("Result >>> " + result);
        System.out.println("result == result >>> " + (result == result));//NaN != NaN
        System.out.println("NaN ++ >>> " + result++);
        System.out.println("NaN +1 >>> " + (result + 1));
        System.out.println("Double.isNaN(result) >>> " + Double.isNaN(result));
    }

}
