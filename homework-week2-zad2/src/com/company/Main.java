package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int perimeter = 0;
        int area = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("enter int for a:");
        int a = scan.nextInt();
        System.out.println("enter int for b:");
        int b = scan.nextInt();
       // int area=0, perimeter = 0,a=2,b=6;
        perimeterOfRectangle(perimeter,a,b);
        areaOfRectangle(area, a, b);

    }

    public static void perimeterOfRectangle(int perimeter, int x, int y) {

        perimeter= x*2+y*2;
        System.out.println("perimeter = " + perimeter);
    }

    public static void areaOfRectangle(int area, int x, int y) {
        area = x*y;
        System.out.println("area = " + area);
    }
}
