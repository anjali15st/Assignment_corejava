package positive;

import java.util.Scanner;

public class righttrainagle_demo {
	public static void main(String[] args) 
	{
		int i,j,n,k=1;
		System.out.print("Input Number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for(i=1;i<=n;i++)
		{
			for(j=1;j<=i;j++) 
			{
				System.out.print(k++);
			}
			System.out.println("");
		}
	}
}
