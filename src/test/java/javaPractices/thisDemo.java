package javaPractices;

public class thisDemo {
	
	int a = 7;
	
	public void getData()
	{
		int a = 5;
		int sum = this.a +a;
		System.out.println(a);
		System.out.println(this.a);
		System.out.println(sum);
		
		int total = a *this.a;
		System.out.println(total);
	}

	public static void main(String[] args) {
		
		
		thisDemo td = new thisDemo();
		td.getData();

	}

}
