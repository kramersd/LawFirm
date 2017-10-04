
public class Janitor extends Employee {
	
	private int additionalHours = 40;
	private int decreaseSalary = -10000;
	private int decreaseVacationDays = -5;
	
	@Override
	public int getHours() {
		return additionalHours + super.getHours();
	}
	@Override
	public double getSalary() {
		return decreaseSalary + super.getSalary();
	}
	@Override
	public int getVacationDays() {
		return decreaseVacationDays + super.getVacationDays();
	}
	
	@Override
	public String toString() {
		return "Janitor";
	}
	
	public void clean() {
		System.out.println("Workin' for the man.");
	}
}
