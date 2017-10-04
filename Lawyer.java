
public class Lawyer extends Employee {
	
	private int vacationDays = 15;
	private String vacationForm = "pink";
	
	@Override
	public int getVacationDays() {
		return vacationDays;
	}
	
	@Override
	public String getVacationForm() {
		return vacationForm;
	}
	
	@Override
	public String toString() {
		return "Lawyer";
	}
	
	public void sue() {
		System.out.println("I'll see you in court!");
	}
}
