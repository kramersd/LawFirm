
public class Secretary extends Employee{
	public void takeDictation(String dict) {
		System.out.println("Dictating Text: " + dict);
	}
	
	@Override
	public String toString() {
		return "Secretary";
	}
}
