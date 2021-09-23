package com.bridgelabz.Line_comparison;
import java.util.*;
public class LineComparison {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of x1 : ");
        int x1 = sc.nextInt();
        System.out.print("Enter the value of x2 : ");
        int x2 = sc.nextInt();
        System.out.print("Enter the value of y1 : ");
        int y1 = sc.nextInt();
        System.out.print("Enter the value of y2 : ");
        int y2 = sc.nextInt();
        System.out.println("Length of the line is : "+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
        sc.close();
    }
}

