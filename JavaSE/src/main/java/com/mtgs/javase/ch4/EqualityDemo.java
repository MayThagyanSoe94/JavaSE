/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.javase.ch4;

/**
 *
 * @author May Thagyan
 */
public class EqualityDemo {

    public static void main(String[] args) {
        String str = "Hello";
        String str2 = "Hello";
        //String str3 = new String("Hello");
        String str3 = null;
        System.out.println("str == str2 >>> " + (str == str2));//same object?
        System.out.println("str == str3 >>> " + (str == str3));
        System.out.println("Str  >>> " + System.identityHashCode(str));
        System.out.println("Str2 >>> " + System.identityHashCode(str2));
        System.out.println("Str3 >>> " + System.identityHashCode(str3));
        System.out.println("str.equals(str2) >>> " + str.equals(str2));
        System.out.println("str.equals(str3) >>> " + str.equals(str3));//content 
        System.out.println("(\"Hello\".equals(str3)) >>> " + ("Hello".equals(str3)));//content 
        System.out.println("str3.equals((\"Hello\")) >>> " + (str3.equals("Hello")));//null pointer 
    }

}
