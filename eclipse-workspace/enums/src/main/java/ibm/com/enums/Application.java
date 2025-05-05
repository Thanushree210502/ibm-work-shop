package ibm.com.enums
 enum Apple{
		GoldenDel(10),
		RedDel(20),
		Dala(30);
	 private int price;
	 Apple(int cost){
		 price=cost;
	 }
	 public int getPrice(){
		 return price;
	 }
	}

public class Application
{
	public static void main( String[] args )
	{
//		Apple applee = Apple.RedDel;
//		System.out.println(applee);
		Apple[] apples = Apple.values();
		for(Apple apple:apples) {
			System.out.println(apple+" costs: "+apple.getPrice());
		}
		
		
	}
}