import java.util.Scanner;

// Program to calculate Simple Interest
class simpleinterest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        
        	// Taking input from the user
        	System.out.print("Enter Principal amount: ");
        	double principal = scanner.nextDouble();
        
        	System.out.print("Enter Rate of Interest: ");
        	double rate = scanner.nextDouble();
        
        	System.out.print("Enter Time: ");
        	double time = scanner.nextDouble();
        
        	// Simple Interest formula: SI = (P * R * T) / 100
        	double simpleInterest = (principal * rate * time) / 100;
        
        	// Displaying the result
        	System.out.println("Simple Interest: " + simpleInterest);
        
        	scanner.close();
    }
}
