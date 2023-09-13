package opps;

class overloding{
	void call()
	{
		System.out.println("call");
	}
	void call(int a, int b)
	{
		System.out.println("a is :" +a   +"\n"   +"b is :" + b);
	}
	void call(int a,int b,int c)
	{
		System.out.println("a is :"+a +" b is :"+b+ "c is :"+c);
		
	}
	
}
public class overLoading {
	public static void main(String args[]) {
		overloding ll=new overloding();
		ll.call();
		ll.call(76, 89);
		ll.call(254, 82, 35);
	}

}
