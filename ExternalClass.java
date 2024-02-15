
public class ExternalClass {

	@SuppressWarnings("deprecation")
	public void invokeDeprecatedMethod() {
		OnSiteWorker worker = new OnSiteWorker("Joseff", "Libermann", 20);
		worker.calculateSalary(40); 
	}
}
