
public class prgmDemo2 {

	public static void main(String[] args) {
		
		int size=5;
		int alphabet=64;
		
		for(int i=1;i<=size;i++)
		{
			
			for(int j=1;j<=size;j++)
			{
				if(i==1 || i==5)
				{
					System.out.print((char)(alphabet+j));
				}
				else if(j==1)
				{
					System.out.print((char)(alphabet+j));
				}
				else if(j==5)
				{
					System.out.print((char)(alphabet+j));
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
