package ObjectClass;

public class ConstructorApp {
	String name;
	int age;
	int rollno;
	String gender;
	float percentage;

	public ConstructorApp(String a,int b,int c,String d,float e) 
	{
		name=a;
		age=b;
		rollno=c;
		gender=d;
		percentage=e;
		
	

	}
	void study()
	{
		System.out.println(name);
		System.out.println(age);
	}

}
