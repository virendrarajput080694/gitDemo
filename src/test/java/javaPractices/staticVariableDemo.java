package javaPractices;

public class staticVariableDemo {
	
	String name;
	String address;
	static String city="Banglore";
	static int i=0;
	
	public staticVariableDemo(String name, String address)
	{
		this.name = name;
		this.address = address;
		i++;;
		System.out.println(i);
		
	}
	
	public void getAddress()
	{
		System.out.println(address+" "+city);
	}
	
	public void getName()
	{
		System.out.println(name);
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}

	public static void main(String[] args) {
		
		
		staticVariableDemo svd = new staticVariableDemo("Ram","HSR Layout");
		staticVariableDemo svd1 = new staticVariableDemo("Tim","Kormangla");
		
		svd.getAddress();
		svd1.getAddress();
		
		svd.getName();
		
		staticVariableDemo.city="Amdavad";
		staticVariableDemo.i=5;
		svd.address = "Bodakdev";
		

	}

}
