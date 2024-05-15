package prac;

public class ExceptionTest {
	public static void main(String[] args) {
		String input = "vanu";
		try {
			int age = Integer.parseInt(input);
			System.out.println(age);
		} catch (Exception e) {
			System.out.println("Validation Failed! Please enter integer number.");
		}
	}
}
