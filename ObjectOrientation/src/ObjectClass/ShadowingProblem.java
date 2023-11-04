package ObjectClass;

public class ShadowingProblem {
	String name;
	int age;
	int rollno;
	float percentage;
	public ShadowingProblem(String name,int age,int rollno,float percentage) 
	{
		this.name=name;
		age=age;
		rollno=rollno;
		percentage=percentage;
		

	}
	void Study()
	{
		System.out.println(name);
	}

}
