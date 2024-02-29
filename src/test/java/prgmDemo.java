
public class prgmDemo {

	public static void main(String[] args) {
		
		int alphabet = 64;
		int count=1;
		
		for(int i=1;i<=5;i++)
		{
			
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alphabet+count++));
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print((char)(alphabet+count++));
			}
			count=1;
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
				System.out.print((char)(alphabet+count++));
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print((char)(alphabet+count++));
			}
			count=1;
			System.out.println();
		}
		
	}

}
