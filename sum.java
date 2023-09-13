package opps;
import java.util.*;
class sumTwo
{
	void Show( int x,int y) 
	{
		int add= x+y;
		System.out.println("The sum two number is :"+add);
	}
	
	void check(int a,int b,int c) 
	{
		if(a!=b || b!=c ) {
			if(a>b && a>c) 
			{
				System.out.println("A is greater " +a);
				
			}
			else if(b>a && b>c) {
				System.out.println("B is greater " +b);
			}
			else {
				System.out.println("C is greater " +c);
			}
			
		}
		else {
			System.out.println("Some number are equal");
		}
		
	 }

}
 
public class sum {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter  number:  ");
		int a= sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		
		sumTwo ss =new sumTwo();
		ss.Show(a, b);
		
		ss.check(a, b, c);
		
		
	}

}
