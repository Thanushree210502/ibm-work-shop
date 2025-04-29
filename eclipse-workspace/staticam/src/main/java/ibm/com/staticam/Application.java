package ibm.com.staticam;

class Data{
	static public int value;
	public int getvalue(){
		return value;
	}
	}
public class Application
{
	int count =100;
	public static void main( String[] args)
	{
		Application application =new Application();
		System.out.println(application.count);
	}
}