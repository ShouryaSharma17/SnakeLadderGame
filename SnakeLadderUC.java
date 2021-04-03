import java.util.Random;

public class SnakeLadderUC {
    public static void main(String args[]) {
        Random random = new Random();
        System.out.println("Playing options are: '0' for No Play, '1' for Ladder and '2' for Snake");
        System.out.println("------------------------------------------------------------------------");
        //Constants
        int NO_PLAY = 0;
        int LADDER = 1;
        int SNAKE = 2;

        //Variables
        int positionPlayer1 = 0;
        int positionPlayer2 = 0;
        int counterP1 = 0;
        int counterP2 = 0;


        while ((positionPlayer1 < 100) && (positionPlayer2 < 100)) {
            //code off player 1
            counterP1++;

            int diceRollP1 = random.nextInt(6);
            int optionsP1 = random.nextInt(3);

            int finalDiceRollP1 = diceRollP1 + 1;

            System.out.println("For player 1");
            System.out.println("dice roll no: " + finalDiceRollP1);
            System.out.println("playing option:" + optionsP1);

            if (optionsP1 == NO_PLAY)
                positionPlayer1 = positionPlayer1 + 0;
            else if (optionsP1 == LADDER)
                if (positionPlayer1 + finalDiceRollP1 > 100)
                    positionPlayer1 = positionPlayer1 + 0;


                else
                    positionPlayer1 = positionPlayer1 + finalDiceRollP1;

            else {
                positionPlayer1 = positionPlayer1 - finalDiceRollP1;
                if (positionPlayer1 <= 0)
                    positionPlayer1 = 0;
            }

            System.out.println("dice roll no:" + counterP1 + "| current position:" + positionPlayer1);
            System.out.println("---------------------------------------------------------------------------------------------");
	}
}
}
