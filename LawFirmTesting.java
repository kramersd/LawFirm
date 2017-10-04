
public class LawFirmTesting {
	
	public static void main(String[] args) {
		
		//Instances of each employee type
		Janitor a = new Janitor();
		Secretary b = new Secretary();
		Lawyer c = new Lawyer();
		LegalSecretary d = new LegalSecretary();
		HarvardLawyer e = new HarvardLawyer();
		
		
		//Janitor
		System.out.println("The salary for a " + a + " is: " + a.getSalary());
		System.out.println("The hours for a " + a + " are: " + a.getHours());
		System.out.println("The number of vacation days for a " + a + " are: " + a.getVacationDays());
		System.out.println("The color of vacation form for a " + a + " is: " + a.getVacationForm());
		a.clean();
		System.out.println();
		
		//Secretary
		System.out.println("The salary for a " + b + " is: " + b.getSalary());
		System.out.println("The hours for a " + b + " are: " + b.getHours());
		System.out.println("The number of vacation days for a " + b + " are: " + b.getVacationDays());
		System.out.println("The color of vacation form for a " + b + " is: " + b.getVacationForm());
		b.takeDictation("Hello");
		System.out.println();
		
		//Lawyer
		System.out.println("The salary for a " + c + " is: " + c.getSalary());
		System.out.println("The hours for a " + c + " are: " + c.getHours());
		System.out.println("The number of vacation days for a " + c + " are: " + c.getVacationDays());
		System.out.println("The color of vacation form for a " + c + " is: " + c.getVacationForm());
		c.sue();
		System.out.println();
		
		//LegalSecretary
		System.out.println("The salary for a " + d + " is: " + d.getSalary());
		System.out.println("The hours for a " + d + " are: " + d.getHours());
		System.out.println("The number of vacation days for a " + d + " are: " + d.getVacationDays());
		System.out.println("The color of vacation form for a " + d + " is: " + d.getVacationForm());
		d.fileLegalBriefs();
		System.out.println();
		
		//HarvardLawyer
		System.out.println("The salary for a " + e + " is: " + e.getSalary());
		System.out.println("The hours for a " + e + " are: " + e.getHours());
		System.out.println("The number of vacation days for a " + e + " are: " + e.getVacationDays());
		System.out.println("The color of vacation form for a " + e + " is: " + e.getVacationForm());
		e.sue();
		System.out.println();
		
	}

}
