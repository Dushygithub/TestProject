package NumberPattern;

public class PatternProgram4 {

	public static void main(String[] args) {
		int count=5*5;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+count+" ");
					count--;
				}
				else
				{
					System.out.print(count+" ");
					count--;
				}
			}
			System.out.println();
		}
	}

}
