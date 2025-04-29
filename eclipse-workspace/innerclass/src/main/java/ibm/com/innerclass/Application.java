package ibm.com.innerclass;
class Eye{
	public float power;
	public String color;
}
class Human{
	public HumanEye leftEye;
	public HumanEye rightEye;
	public Human() {
		leftEye = new HumanEye();
		rightEye = new HumanEye();
	}
	static class HumanEye extends Eye{
		static int value;
	}
}
class Man extends Human{
	
}
public class Application
{
	public static void main( String[] args )
	{
		
		Human.HumanEye.value = 9;
		System.out.println(Human.HumanEye.value);
	}
}