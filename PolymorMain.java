class Animal 
{
	public void whoAmI()
	{
		System.out.println("I am an animal");
	}
}
class Dog extends Animal
{
	public void whoAmI()
	{
		System.out.println("I am a Dog");
	}

}
class Cat extends Animal
{
	public void whoAmI()
	{
		System.out.println("I am a cat");
	}

}
class PolymorMain 
{

	public static void main(String[] args) 
	{
		Animal a=new Animal();
		a.whoAmI();
		
		a=new Dog();
		a.whoAmI();
		
		a=new Cat();
		a.whoAmI();

	}

}