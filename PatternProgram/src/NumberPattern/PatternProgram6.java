package NumberPattern;

public class PatternProgram6 {

	public static void main(String[] args) {
		int evencount=2;
		int oddcount=1;
		for(int i=1;i<=4/2;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(evencount<=9)
				{
					System.out.print("0"+evencount+" ");
					evencount+=2;
				}
				else
				{
					System.out.print(evencount+" ");
					evencount+=2;
				}
				
			}
			System.out.println();
		}
		for(int i=1;i<=4/2;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(oddcount<=9)
				{
					System.out.print("0"+oddcount+" ");
					oddcount+=2;
				}
				else
				{
					System.out.print(oddcount+" ");
					oddcount+=2;
				}
				
			}
			System.out.println();
		}
	}

}
