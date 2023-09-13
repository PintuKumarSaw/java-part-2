package opps;
import java.util.Scanner;
class loops{
	
	void looping()
	{
		int i=1;
		while(i<=15)
		{
			if(i%3==0)
			{
				System.out.println("Hello " +i);
			}
			 if(i%5==0)
			{
				System.out.println("Welcome " +i);
			}
			if(i%2==0 && i%3==0)
			{
				System.out.println("sorry " +i);
			}
			
			i++;
			
		}
		
	}
	
}

public class classWork {
	public static void main(String args[])
	{
		loops ll=new loops();
		ll.looping();
		
		
	}

}
