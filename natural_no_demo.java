package positive;

import java.util.Scanner;

public class natural_no_demo {
	public static void main(String[] args) {
		int i=1;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter value :");
		int n=sc.nextInt();
		System.out.println("Natural Numbers are");
		
		while(i<=10)
		{
			System.out.println(i);
			i++;
		}
	}
}
