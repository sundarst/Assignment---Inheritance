class Shape
{
		public void shape()
		{
			System.out.println("Shape");
		}


}
class Circle extends Shape
{
	public void shape()
		{
			System.out.println("Shape is circle");
		}
}

class Rectangle extends Shape
{
	
	public void shape()
		{
			System.out.println("Shape is Rectangle");
		}
}
class Geometricshape{
	public static void main(String [] args)
	{
		
		Circle circleObj=new Circle();
		circleObj.shape();
		Rectangle RectangleObj=new Rectangle();
		 RectangleObj.shape();
	}
}

/*
Mistake 
Shape.java:28: error: cannot find symbol
                shapeObj.circle();
				parent class cannot access student method can doing only in type casting


*/