import java.util.*;
public class SnakeLadderUC {
	public static void main(String[] args) {
		Random random= new Random();
		int diceRoll = random.nextInt(6);
		int options = random.nextInt(3);
		//CONSTANTS
		int NO_PLAY = 0;
		int LADDER = 1;
		int SNAKE = 2;
		//VARIABLE
		int finalDiceRoll = diceRoll + 1;
      		int position= 0;
		System.out.println("dice roll no. is" + finalDiceRoll);
		System.out.println("playing option is" + options);
		if (options == NO_PLAY)
			position = position + 0;
		else if (options == LADDER)
			position = position + finalDiceRoll;
		else {
			position = position - finalDiceRoll;
			if (position <= 0)
				position = 0;
		     }
		     System.out.println("Current position:" +position);
		}
}
