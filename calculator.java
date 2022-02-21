package Arithemetic_Calculator;
import java.util.Scanner;
public class calculator {

	public static void main(String[] args) {
		float result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A ");
		int a=sc.nextInt();
		System.out.println("Enter B ");
		int b=sc.nextInt();
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		switch(choice)
		{
		case 1:
			result=a+b;
			break;
		case 2:
			result=a-b;
			break;
		case 3:
			result=a*b;
			break;
		case 4:
			result=a/b;
			break;
		case 5:
			result=a%b;
			break;
		default:
	System.out.println("Invalid choice");
			
		}
		if(choice>=1 && choice<=5)
	System.out.println("Result of A and B is " +result);
			

	}

}
