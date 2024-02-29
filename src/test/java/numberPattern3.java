

public class numberPattern3 {

	public static void main(String[] args) {
		
		int size=5;
		int num=1;
		
		for(int i=1;i<=5;i++)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				if(j==1)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int m=2;m<=i;m++)
			{
				
				if(m==i)
				{
					System.out.print("2");
				}
				else
				{
					System.out.print(" ");
				}
			}
			num=1;
			System.out.println();
		}
		
		for(int i=4;i>=1;i--)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				
				if(j==1)
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int m=2;m<=i;m++)
			{
				
				if(m==i)
				{
					System.out.print("2");
				}
				else
				{
					System.out.print(" ");
				}
			}
			num=1;
			System.out.println();
		}
		
		
	

	}

}
