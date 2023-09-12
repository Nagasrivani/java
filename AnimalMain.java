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
class AnimalMain 
{
	public static void main(String[] args) 
	{
		Animal a=new Animal();
		Dog d=new Dog();
		Cat c=new Cat();
		
		a.whoAmI();
		d.whoAmI();
		c.whoAmI();
	}
}