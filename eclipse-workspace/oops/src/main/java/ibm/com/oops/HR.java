package ibm.com.oops;

public class Application{
	public static void main(string[] args) {
		HR hr=new HR();
		Finance finance =new Finance();
		Employee employee =hr.recuit("i");
		if (employee !=null) {
			finance.processSalary(employee);
		}
		employee = hr.recuit("p");
		if(employee !=null) {
			finance.processSalary(employee);
		}
		}
	


