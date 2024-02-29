
public class patternDemo2 {

	public static void main(String[] args) {
		
		
		int size=5;
		int alpha=65;
		int count=0;
		
		for(int i=1;i<=size;i++)
		{
			for(int k=size;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print((char)(alpha+count++));
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
					System.out.print((char)(alpha+count++));
				}
				else
				{
					System.out.print(" ");
				}
			}
			count=0;
			System.out.println();
		}
		
		for(int i=size-1;i>=1;i--)
		{
			for(int k=size;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				if(j==1)
				{
					System.out.print((char)(alpha+count++));
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
					System.out.print((char)(alpha+count++));
				}
				else
				{
					System.out.print(" ");
				}
			}
			count=0;
			System.out.println();
		}
		
	}

}
