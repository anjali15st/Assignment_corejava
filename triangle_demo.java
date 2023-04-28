package positive;

import java.util.Scanner;

public class triangle_demo {
	public static void main(String[] args) 
	{
		int i,j,k;
		System.out.print("Input Number :");
		Scanner sc=new Scanner(System.in);
		k=sc.nextInt();
		for(i=1;i<=k;i++)
		{
			for(k=0;k<10-i;k++)
			{
				System.out.print(" ");
			}
			for(j=1;j<=i;j++) 
			{
				System.out.print(j);
			}
			System.out.println("");
		}
	}
}
