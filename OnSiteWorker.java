
public class OnSiteWorker extends Worker {

	private static final int VALUE_OF_PETROL = 200;

	public OnSiteWorker(String name, String surname, int priceHour) {
		super(name, surname, priceHour);
		// TODO Auto-generated constructor stub
	}

	@Deprecated
	public int calculateSalary(int hoursWorked) {
		 // This method is deprecated and should not be used.
		return super.calculateSalary(hoursWorked + VALUE_OF_PETROL);
	}

}
