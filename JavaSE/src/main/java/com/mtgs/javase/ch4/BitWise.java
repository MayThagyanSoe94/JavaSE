/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.javase.ch4;

/**
 *
 * @author May Thagyan
 */
public class BitWise {

    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        System.out.println("5 bit wise >>> " + Integer.toBinaryString(a));
        System.out.println("1 bit wise >>> " + Integer.toBinaryString(b));
        System.out.println("a & b >>> " + (a & b));
//        System.out.println("bit wise 5 + bit wise 1 >>> " 
//                + (Integer.toBinaryString(a) + Integer.toBinaryString(b)));
// can't operate like this to get the bitwise value

        System.out.println("a & b >>> " + Integer.toBinaryString(a & b));
        System.out.println("a | b >>> " + Integer.toBinaryString(a | b));
        System.out.println("a ^ b >>> " + Integer.toBinaryString(a ^ b));
        System.out.println("~a >>> " + Integer.toBinaryString(~a));
        System.out.println("a >> " + Integer.toBinaryString(a >> 1));
        System.out.println("a << " + Integer.toBinaryString(a << 1));
        System.out.println("a >> right is equal to / by 2 >>> " + (a >> 1));
        System.out.println("a << left is equal to * by 2 >>> " + (a << 1));

    }
}
