package com.FirstJavaProject;

import java.util.Scanner;

public class Lib {
    // Use Scanner in lot of function so define in global const
    final static Scanner READ = new Scanner(System.in);

    // Read int
    public static int readInt(String message)
    {
        System.out.println(message);
        return READ.nextInt();
    }

    // Read long
    public static long readLong(String message)
    {
        System.out.println(message);
        return READ.nextLong();
    }

    // Read double
    public static double readDouble(String message)
    {
        System.out.println(message);
        return READ.nextDouble();
    }

    // Read char
    public static char readChar(String message)
    {
        System.out.println(message);
        String c = READ.next();
        return c.charAt(0);
    }



}
