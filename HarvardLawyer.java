
public class HarvardLawyer extends Lawyer {

	private double salaryIncreasePercent = 0.20;
	private int increaseVacation = 3;
	private int vacationFormCount = 4;
	
	@Override
	public double getSalary() {
		return (salaryIncreasePercent * super.getSalary()) + super.getSalary();
	}
	
	@Override
	public int getVacationDays() {
		return increaseVacation + super.getVacationDays();
	}
	
	@Override
	public String getVacationForm() {
		String temp = "";
		for(int i = 0; i < vacationFormCount; i++) {
			temp = temp + super.getVacationForm();
		}
		return temp;
	}	
}
