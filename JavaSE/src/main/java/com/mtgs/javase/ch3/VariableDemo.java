/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mtgs.javase.ch3;

/**
 *
 * @author May Thagyan
 */
public class VariableDemo {

    public static void main(String[] args) {
        byte a;// 8 bit (From -2^7 to (2^7)-1) => -128 to 127
        short b;// 16 bit (from -2^15 to (2^15)-1) => -32768 to 32767
        int c;//32 bit (forom -2^31 to (2^32)-1) => -2147483648 to 2147483647
        long d;//64 bit (from -2^63 to (2^63)-1) => -9223372036854775808 to 9223372036854775807
        a = 127;
        System.out.println("a >>> " + a);
        a++;
        System.out.println("byte a++ >>> " + a);
        a++;
        System.out.println("byte a++ >>> " + a);
        a = -128;
        System.out.println("byte a >>> " + a);
        a--;
        System.out.println("byte a-- >>> " + a);
        a--;
        System.out.println("byte a-- >>> " + a);
        b = 32767;
        System.out.println("short b " + b);
        b++;
        System.out.println("short b++ " + b);
        b++;
        System.out.println("short b++ " + b);
        b = -32768;
        System.out.println("short b " + b);
        b--;
        System.out.println("short b-- " + b);
        b--;
        System.out.println("short b-- " + b);
        c = 2147483647;
        System.out.println("int c " + c);
        c++;
        System.out.println("int c ++ " + c);
        c++;
        System.out.println("int c ++ " + c);
        c = -2147483648;
        System.out.println("int c " + c);
        c--;
        System.out.println("int c-- " + c);
        c--;
        System.out.println("int c-- " + c);
        d = 9223372036854775807L;
        System.out.println("long d " + d);
        d++;
        System.out.println("long d++ " + d);
        d++;
        System.out.println("long d++ " + d);
        d = -9223372036854775808L;
        System.out.println("long d " + d);
        d--;
        System.out.println("lng d-- " + d);
        d--;
        System.out.println("long d-- " + d);
        float f = 3.2f;
        double e = 3.2;
        char x = 'A';//char is 2 byte
        x++;
        System.out.println("A ++ >>> " + x);
        char k = 75;
        
        System.out.println("K >>> "+ k);

    }

}
