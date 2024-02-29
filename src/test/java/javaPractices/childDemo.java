package javaPractices;

public class childDemo extends parentDemo {
	
	String name="Selenium Java";
	
	public childDemo()
	{
		super();
		System.out.println("child class constructor");
		
	}
	
	public void stringGetData()
	{
		System.out.println(name);
		System.out.println(super.name);
	}
	
	public void getData()
	{
		super.getData();
		System.out.println("I am child class method.");
	}

	public static void main(String[] args) {
		
		childDemo cd = new childDemo();
		cd.stringGetData();
		cd.getData();
		

	}

}
