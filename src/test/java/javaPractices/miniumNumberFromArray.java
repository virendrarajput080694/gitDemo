package javaPractices;

public class miniumNumberFromArray {
	
/*	2 4 7
	3 0 9
	1 5 8  */
	

	public static void main(String[] args) {
		
		
		int abc[][] = { { 2, 4, 7 }, { 3, 0, 9 }, { 1, 5, 8 } };

		int min = abc[0][0];
		int minicolumn = 0;

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {

				if (abc[i][j] < min) {

					min = abc[i][j];
					minicolumn = j;
				}

			}

		}
		System.out.println(minicolumn);
		
		//System.out.println(min);
		
		int max = abc[0][minicolumn];
		
		int k = 0;
		
		while(k<3)
		{
			
			if(abc[k][minicolumn]>max)
			{
				max = abc[k][minicolumn];
				
			}
			k++;
		}
		 
		System.out.println(max);
		
		
	}

}
