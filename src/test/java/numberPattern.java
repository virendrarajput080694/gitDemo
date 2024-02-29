

public class numberPattern {

	public static void main(String[] args) {
		
		int size=5;
		int num=1;
		
		for(int i=1;i<=size;i++)
		{
			for(int k=size;k>=i;k--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("*" +" ");
				num++;
			}
			//num=1;
			System.out.println();
			
		}
		

	}

}
