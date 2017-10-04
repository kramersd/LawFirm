
public abstract class Employee {
	
	private int hours = 40;
	private int salary = 40000;
	private int vacationDays = 10;
	private String vacationForm = "yellow";
	
	public int getHours() {
		return hours;
	};
	
	public double getSalary() {
		return salary;
	}
	
	public int getVacationDays() {
		return vacationDays;
	}
	
	public String getVacationForm() {
		return vacationForm;
	}
	
}
