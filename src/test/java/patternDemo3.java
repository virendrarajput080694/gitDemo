
public class patternDemo3 {

	public static void main(String[] args) {
		
		int size=5;
		
		for(int i=size;i>=1;i--)
		{
			for(int k=5;k>=i;k--)
			{
				
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1 || i==size)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			for(int m=2;m<=i;m++)
			{
				if(i==size || m==i)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}
		
	}

}
