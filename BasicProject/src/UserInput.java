import java.io.IOException;
import java.util.Scanner;

public class UserInput{
	public static void main (String args[]){
		//Scanner scanner = new Scanner(System.in);
		boolean keepRunning = true;
		boolean printBool = true;
		
		System.out.println("Hello");
		String entry = "";
		char input[] = new char[20];
		
//		while (keepRunning && scanner.hasNextLine()) {
//			entry = scanner.nextLine();
		while (keepRunning) {
			int returnValue = -1;
			int inputCount = 0;
			
			do {
				try {
				    returnValue = System.in.read();	
				}
				catch (IOException e) {
				    System.out.println(e.getMessage());
				    keepRunning = false;
				    continue;
				}
				
				if (returnValue > -1) {
				    input[inputCount] = (char) returnValue;
				    if (input[inputCount] == '\n') {
				    	input[inputCount] = '\0';
				    }
				}
			}
			while (returnValue > -1 && inputCount < 19 && input[inputCount++] != '\0');
			
			if (returnValue < 0 || inputCount > 19) {
				keepRunning = false;
			    continue;
			}
			
			entry = String.valueOf(input);
			
			System.out.println("Input:       \"" + entry + "\"");
			
			String testValue = "Hey there";
			
			System.out.println("Test value:  \"" + testValue + "\"");
			
			if (entry.equalsIgnoreCase(testValue) && printBool == true) {
				System.out.println("Hi");
			}
			else{
				System.out.println("Out of luck");
				keepRunning = false;
			}
		}
    }
}
