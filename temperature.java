import java.util.Scanner;

class temperature{
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter temperature in Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		double celsius = (fahrenheit - 32) * 5/9;
		System.out.println("Temperature in celsius is: " + celsius);
		scanner.close();	

}

}