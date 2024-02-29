
public class patternDemo5 {

	public static void main(String[] args) {
		
		int rows = 5;
		
		for(int i=1;i<=5;i++)
		{
			for(int j=rows-i;j>=0;j--)
			{
				System.out.print(" ");
			}
			for(int s=1;s<=i;s++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
