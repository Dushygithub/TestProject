package NumberPattern;

public class PatternProgram7 {

	public static void main(String[] args) {
		int count=1;
		int a=5;
		for(char i=1;i<=5;i++)
		{
			for(char j=1;j<=a-i+1;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+count+" ");
					count++;
				}
				else
				{
					System.out.print(count+" ");
					count++;
				}
				
			}
			System.out.println();
		}

	}

}
