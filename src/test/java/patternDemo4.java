
public class patternDemo4 {

	public static void main(String[] args) {
		
		
		int size=5;
		int count=0;
		int alpha=65;
		
		for(int i=1;i<=size;i++)
		{
			for(int k=size;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha+count++));
			}
			for(int m=2;m<=i;m++)
			{
				System.out.print((char)(alpha+count++));
			}
			count=0;
			System.out.println();
		}
		
	}

}
