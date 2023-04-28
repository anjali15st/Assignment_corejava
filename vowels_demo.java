package positive;

import java.util.Scanner;

public class vowels_demo {
public static void main(String[] args) {
		
		char ch;
		System.out.println("Please enter Character :");
		Scanner sc=new Scanner(System.in);
		ch=sc.next().charAt(0);
	
		if((ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'));
		{
			System.out.println(ch +"is a vowel");
		}
		{
			System.out.println(ch +"is a constant");
		}
		
		
			
	}

}
