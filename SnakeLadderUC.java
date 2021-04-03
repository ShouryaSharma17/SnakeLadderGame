import java.util.Random;

public class SnakeLadderUC {
    public static void main(String args[]) {
        Random random = new Random();


        //Constants
        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;
        int counter = 0;

        //Variables
        int position = 0;

        while (position < 100) {
            counter++;

            int diceRoll = random.nextInt(6);
            int options = random.nextInt(3);
            int finalDiceRoll = diceRoll + 1;
            System.out.println("dice roll no is: " + finalDiceRoll);
            System.out.println("playing option is :" + options);
            if (options == NO_PLAY)
                position = position + 0;
            else if (options == LADDER)
                if (position + finalDiceRoll > 100)
                    position = position + 0;
                else
                    position = position + finalDiceRoll;

            else {
                position = position - finalDiceRoll;
                if (position <= 0)
                    position = 0;



            }
            System.out.println("dice roll no:" + counter + " current position:" + position);
        }
    }
}
