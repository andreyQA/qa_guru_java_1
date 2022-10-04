package com.example;

public class HelloWorld {

    public static void main(String[] args) {

        byte aByte = 100;
        byte bByte = 26;
        byte cByte = (byte) (Byte.MAX_VALUE + 1);
        System.out.println(cByte);
        System.out.println(cByte - 10);
        byte dByte = (byte) (Byte.MIN_VALUE - 1);
        System.out.println(dByte);

    }
}
