import java.util.Random;

import javax.swing.JOptionPane;

public class NumberGuessingGame1 {
	public static void main(String[] args) {
		for (int i = 0; i < 1; i++) {
	String Userchoice=JOptionPane.showInputDialog(null,"Do you want to play again?");
	if(Userchoice.equals("yes")) {
	i--;
	int random = new Random().nextInt(3);
		String input = JOptionPane.showInputDialog(null,"Guess a number between 0 and 2.");
		int userGuess = Integer.parseInt(input);
		if(userGuess==random) {
			System.out.println("you guessed correctly!");
		}else {
			System.out.println("That is not correct. I'll give you another chance.");
				input = JOptionPane.showInputDialog(null,"Guess a number between 0 and 2.");
				userGuess = Integer.parseInt(input);
			if(userGuess==random) {
				System.out.println("You guessed correctly!");
			}
		}
}
}
}
}