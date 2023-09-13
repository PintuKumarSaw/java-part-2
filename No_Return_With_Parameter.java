package opps;

class temp{
	void call(int a, int b) {
		System.out.println("a+b is : "+(a+b));
	}
}

public class No_Return_With_Parameter {
	public static void main(String args[]) {
		temp a=new temp();
		a.call(10,20);
		
	}

}
