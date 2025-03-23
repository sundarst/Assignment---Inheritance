class Student
{
	String name;
	String place;
	Student()
	{
		
	}
	
	Student(String name,String place )
	{
		this.name=name;
		this.place=place;
	}
}
class ZsgsStudent extends Student
{
	String fullStack;
	
	ZsgsStudent()
	{
		
	}
	ZsgsStudent(String name,String place,String fullStack)
	{
		super(name,place);
		this.fullStack=fullStack;	
	}
}

public class Constructor
{
	public static void main(String[] args)
	{
		Student student=new ZsgsStudent("kutty","tenkasi","java"); //create parent class object for child class
		System.out.println("Name:"+student.name+"Place:"+student.place);
		
		ZsgsStudent zsgsStudentObj=new ZsgsStudent("sundar","Tenkasi","Java FullStack developer");
		System.out.println("Name:"+zsgsStudentObj.name+" "+"Place:"+zsgsStudentObj.place+" "+"Role:"+zsgsStudentObj.fullStack);
	}

}