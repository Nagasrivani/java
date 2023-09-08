class String_builder 
{

	public static void main(String[] args) 
	{
		StringBuilder sb1=new StringBuilder("I");
		
		System.out.println(sb1);
		sb1.append(" Like");
		sb1.append(" Java");
		System.out.println(sb1);
		
		StringBuilder sb2=new StringBuilder("Learning is fun");
		sb2.insert(9, "Java ");
		System.out.println(sb2);
		
		sb2.replace(0,1,"k");
		System.out.println(sb2);
		sb2.replace(9,13,"kava");
		System.out.println(sb2);
		
		sb2.delete(9, 13);
		System.out.println(sb2);
		sb2.deleteCharAt(11);
		System.out.println(sb2);
		
		sb2.reverse();
		System.out.println(sb2);
	}
}
