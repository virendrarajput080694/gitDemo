
public class patternDemo {

	public static void main(String[] args) {
		
		int num=1;
		int size=5;
		
		for(int i=1;i<=size;i++)
		{
			
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(num++);
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
					System.out.print(num++);
				}
				else
				{
					System.out.print(" ");
				}
			}
			num=1;
			System.out.println();
		}
		
		for(int i=size-1;i>=1;i--)
		{
			
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print(num++);
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
					System.out.print(num++);
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
