
public class prgmDemo4 {

	public static void main(String[] args) {
		
		
		int count=1;
		
		for(int i=5;i>=1;i--)
		{
			for(int k=5;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print(count++);
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print(count++);
			}
			count=1;
			System.out.println();
			
		}
		
	}
}
