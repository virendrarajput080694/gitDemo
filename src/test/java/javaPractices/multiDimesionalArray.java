package javaPractices;

public class multiDimesionalArray {

	public static void main(String[] args) {
		
		
		int a[][] = new int[2][3];
		
		a[0][0] = 2;
		a[0][1] = 24;
		a[0][2] = 72;
		a[1][0] = 12;
		a[1][1] = 3;
		a[1][2] = 5;
		
		//System.out.println(a[0][2]);
		
		int b[][] = {{2,24,72},{12,3,5}};
		
		//System.out.println(b[0][2]);
		
		for(int i=0;i<2;i++)
		{
			
			for(int j=0;j<3;j++)
			{
				System.out.println(b[i][j]);
			}
			
		}
		
	}

}
