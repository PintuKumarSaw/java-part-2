package opps;
class this1{
	int x=10;
	void call() 
	{
		System.out.println("x is "+x);
		System.out.println("this  x "+ this.x);
	
//	show();
	this.show();
	}
	void show()
	{
		int a=20;
		int b=20;
		System.out.println("show");
		System.out.println(a+b);    //20+20
		System.out.println(this.x); //10
		
	}
}

public class This {
	public static void main(String args[])
	{
		this1 th=new this1();
		th.call();
	}

}
