package com.bridgelabz.Line_comparison;

public class LineComparison {


	public static void main(String[] args) {
		int x1,x2,y1,y2,x3,x4,y3,y4;
		double line1, line2;
		x1=1;y1=1;x2=5;y2=5;
		x3=1;y3=1;x4=5;y4=5;
		
		 line1=Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		 line2=Math.sqrt((x4-x3)*(x4-x3) + (y4-y3)*(y4-y3));

		System.out.println("Length of the line 1 is : "+(Math.sqrt(Math.pow((x2-x1),2))+Math.pow((y2-y1) ,2)));
		System.out.println("Length of the line 2 is : "+(Math.sqrt(Math.pow((x4-x3),2))+Math.pow((y4-y3) ,2)));

		if (line1 == line2) 
		{
			System.out.println("Both the lines are equale in length");
		}
		else
		{
			System.out.println("Both lines are unequal in length");	
		}
	}
}


