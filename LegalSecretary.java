
public class LegalSecretary extends Secretary {
	
	private int increaseSalary = 5000;
	
	@Override
	public double getSalary() {
		return increaseSalary + super.getSalary();
	}
	
	@Override
	public String toString() {
		return "LegalSecretary";
	}
	
	public void fileLegalBriefs() {
		System.out.println("Filling papers all day.");
	}
}
