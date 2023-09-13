class A 
{
	int n=100;
	public void dothis()
	{
		System.out.println("Do this in A");
	}
}
class B extends A
{
	int n=200;
	public void dothis()
	{
		System.out.println("Do this in B");
	}
	public void xyz()
	{
		dothis();
		System.out.println("xyz executed "+n);
	}
	public void abc()
	{
		super.dothis();
		System.out.println("abc executed "+n);
	}
}
class SuperMain 
{
	public static void main(String args[])
	{
		B b1=new B();
		b1.xyz();
		System.out.println();
		b1.abc();
	}
}