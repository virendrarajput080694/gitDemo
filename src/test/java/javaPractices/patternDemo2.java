package javaPractices;

public class patternDemo2 {

	public static void main(String[] args) {
		
		int size=3;
		int count=3;
		
		
		/*
		 * for(int i=size;i>=1;i--) {
		 * 
		 * for(int j=1;j<=i;j++) { System.out.print(count +" "); count++; }
		 * 
		 * System.out.println();
		 * 
		 * }
		 */
		
		for(int i=1;i<=size;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count +" ");
				count = 3+count;
				
			}
			System.out.println();
		}

	}

}
