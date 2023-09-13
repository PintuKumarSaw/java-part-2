package opps;

class A{
	int x=10;
	void show() {
		System.out.println("x "+ x);
	}
}
class B
{
	public static void main(String args[]) {
		A a=new A();
		System.out.println(a.x);
		a.x=100;
		a.show();
	}
}
