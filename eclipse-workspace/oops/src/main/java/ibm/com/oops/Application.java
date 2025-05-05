
package ibm.com.oops;
interface Printer{
	void print();
}
class HPPrinter implements Printer{
	@Override
	public void print() {
		System.out.println("HP");
	}
}
class Process{
	public void execute(Printer printer) {
		printer.print();
	}
}

public class Application
{
	public static void main( String[] args )
	{
		Process process = new Process();
		process.execute(new HPPrinter());
	}
}