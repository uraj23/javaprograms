package pattren;

import java.util.Scanner;

public class P8 {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int num=sc.nextInt();
		
		for(int r=1;r<=num;r++)
		{
			for(int c=1;c<r;c++)
			{
				System.out.print(" ");
			}
			for(int s=1;s<=num+1-r;s++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
//		for(int r=1;r<=num;r++)
//		{
//			for(int c=1;c<=num;c++)
//			{
//				if(r==c || r+c==num+1)
//				{
//					System.out.print("* ");
//				}
//				else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}

	}

}
