package Assignments;

public class A2 extends A {
	
	int a;
	A2(int a)
	{
		this.a=a;
	}
	
	public void sandeepp()
	{
		System.out.println("Hello 2");
	}

	public static void binwal() {
		System.out.println("static");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
A a=new A2(4);
a.sandeep();
a.binwal();
	}

}
