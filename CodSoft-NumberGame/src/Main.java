import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		//Number guessing game- CodSoft
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		String play = "yes";
		
		while (play.equals("yes")) {
			int randomNumber = random.nextInt(100) + 1;
			int attempts = 0;
			int userGuess = -1;
			
			while (userGuess != randomNumber) {
				System.out.print("Guess the number between 1-100: ");
				userGuess = scanner.nextInt();
				attempts++;
				
				if (userGuess == randomNumber) {
					System.out.println("\nCorrect! You got it!");
					System.out.println("It took you " + attempts + " attempt/s to win!");
					
					System.out.print("Would you like to play again? yes/no: ");
					play = scanner.next().toLowerCase();
				}
				else if (userGuess > randomNumber) {
					System.out.println("\nYour guess is too high, go low!");
				}
				else {
					System.out.println("\nYour guess is too low, go high!");
				}
			}
		}
		System.out.println("\nThank you for playing!");
		scanner.close();
	}
}
