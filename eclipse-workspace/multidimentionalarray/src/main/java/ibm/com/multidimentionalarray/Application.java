package ibm.com.multidimentionalarray; 
class Data{
	static public int value;
	{
		System.out.println("Inline");
	}
	
	static {
		int value=20;
		System.out.println("Static Initializer executed");
	}
	public static int getValue(){
		return value;
	}
	public Data() {
		System.out.println("Contructor");
	}
}
public class Application
{
	int count = 34;
	public static void main( String[] args )
	{
		new Data();
		
		
	}
}