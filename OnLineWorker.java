
public class OnLineWorker extends Worker {

	private final int priceOfInternet = 60;

	public OnLineWorker(String name, String surname, int priceHour) {
		super(name, surname, priceHour);

	}

	@Override
	public int calculateSalary(int hoursWorked) {

		return super.calculateSalary(hoursWorked + priceOfInternet);
	}

}
