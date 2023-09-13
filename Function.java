package opps;
class Fun {
	//no parameter and no return
	void show() {
		System.out.println("hello guys  this is function");
	}
	// No parameter with parameter
	void show( int a, int b) {
		System.out.println(a +"  "+b);
	}
	// return  with  no parameter
	float dis() {
		float x = 12.202f;
		return x;
	}
	//return  parameter
	String  name(String name) {
		return "Hii bro  " + name;
	}
	//return parameter
	int add(int x ,int b) {
		int sum =x+b;
		return sum;
		
	}
	
	
}

public class Function {
	public static void main(String args []) {
		Fun f =new Fun();
		f.show();
		f.show(12,100);
		 float x=f.dis();
		 System.out.println(x);
		String Name=f.name("pintu");
		System.out.println(Name);
		int a = f.add(120, 80);
		
		System.out.println("The sum of : "+ f.add(64,86));
		System.out.println(a);
	}

}
