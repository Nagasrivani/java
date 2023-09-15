interface Mobile 
{
	void doubletap();
	
}
class Android implements Mobile
{
	public void doubletap()
	{
		System.out.println("Double tap in Android");
	}
}
class Ios implements Mobile
{
	public void doubletap()
	{
		System.out.println("Double tap in Ios");
	}
}
class Interface_main {

	public static void main(String[] args) 
	{
		Mobile m;
		m=new Android();
		m.doubletap();
		
		m=new Ios();
		m.doubletap();

	}

}
