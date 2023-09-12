class Polygon 
{
	double base,height;

	public double getb() 
	{
		return base;
	}

	public void setb(double base) 
	{
		this.base = base;
	}

	public double geth() 
	{
		return height;
	}

	public void seth(double height) 
	{
		this.height = height;
	}
}


class Triangle extends Polygon
{
	public void calctriarea()
	{
		System.out.println("Area of triangle is: "+(0.5*base*height));
	}
}


class Rectangle extends Polygon
{
	public void calcrecarea()
	{
		System.out.println("Area of rectangle is: "+(base*height));
	}
}


class PolygonMain 
{

	public static void main(String[] args) 
	{
		Triangle t1=new Triangle();
		t1.setb(5.2);
		t1.seth(3.2);
		t1.calctriarea();
		
		Rectangle r1=new Rectangle();
		r1.setb(3.4);
		r1.seth(2.3);
		r1.calcrecarea();
		
	}

}