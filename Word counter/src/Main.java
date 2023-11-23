import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan = new Scanner(System.in);
		int counter = 0;
		int myCounter = 0;

		System.out.println("Enter any text: ");
		String inputText = scan.nextLine();
		String[] toCount;

		if (!inputText.equals(null)) {
			toCount = inputText.split(" ");
			
			for (int i = 0; i < toCount.length; i++) {
	        	if (toCount[i].equalsIgnoreCase("and")) {
	        		//
	        	}
	        	else if (toCount[i].equalsIgnoreCase("the")) {
	        		//
	        	}
	        	else if (toCount[i].equalsIgnoreCase("is")) {
	        		//
	        	}
	        	else {
	        		if (toCount[i].equalsIgnoreCase("my"))
	        			myCounter++;
	        		counter++;
	        	}
	        }
	        
	        System.out.println("Total words: " + counter);
	        System.out.println("You used 'my' " + myCounter + " times.");
		}
		
	}

}
