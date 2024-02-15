
public class Main {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		/*
		 * Add to the child classes some obsolete (deprecated) methods, and use the
		 * corresponding annotation. It invokes the obsolete methods from an external
		 * class, suppressing through the corresponding annotation the "warnings" for
		 * being obsolete.
		 */

		OnLineWorker onlineWorker = new OnLineWorker("Stella", "McCartney", 45);
		OnSiteWorker onsiteWorker = new OnSiteWorker("Poppy", "Fei", 32);

		System.out.println("Online worker example of @Override annotation is: " +
				onlineWorker.calculateSalary(40));
		System.out.println("Online worker example of @Override annotation is: " + onsiteWorker.calculateSalary(40));

	}

}
