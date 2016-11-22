package model;

import utilities.Images;
import utilities.Position;

import java.util.Scanner;

/**
 * Created by Bijin on 22-Nov-16.
 */
public class Game
{
    private final static int BOARD_SIZE = 6;

    private GamePad gamePad;
    private Position selectedCardPosition;
    private int solved;

    public Game()
    {
        this.gamePad = new GamePad(BOARD_SIZE);
        this.solved = 0;
        this.selectedCardPosition = null;
    }

    public GamePad getGamePad()
    {
        return gamePad;
    }

    public boolean gameOver()
    {
        return solved == (BOARD_SIZE*BOARD_SIZE);
    }

    public void selectCard(Position position)
    {
        if(selectedCardPosition == null)
        {
            selectedCardPosition = position;
            System.out.println(gamePad.getCardAtPosition(position).getImage());
        }
        else
        {
            Images image1 = gamePad.getCardAtPosition(position).getImage();
            Images image2 = gamePad.getCardAtPosition(selectedCardPosition)
                    .getImage();
            if (image1 == image2)
            {
                gamePad.setCardAsFound(position);
                gamePad.setCardAsFound(selectedCardPosition);
                System.out.println("Found " + image1);
                solved += 2;
            }
            else
            {
                selectedCardPosition = null;
                System.out.println("Not Found \n" + image1);
            }
        }
    }

    public static void main (String args[])
    {
        Game game = new Game();
        game.getGamePad().displayBoard();

        while (!game.gameOver())
        {
            System.out.println("Select location (x y): ");
            Position selectedPosition = getLocationInput();
            game.selectCard(selectedPosition);
        }

        System.out.println("Game Over");




    }

    private static Position getLocationInput()
    {
        Scanner input = new Scanner(System.in);
        int x = input.nextInt();
        int y = input.nextInt();
        return new Position(x, y);
    }

}
