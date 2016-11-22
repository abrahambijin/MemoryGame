package model;

import utilities.Images;
import utilities.Position;

import java.util.Random;

/**
 * Created by Bijin on 22-Nov-16.
 */
public class GamePad
{
    private Card[][] board;
    private final int BOARD_SIZE;


    public GamePad(int boardSize)
    {
        BOARD_SIZE = boardSize;
        this.board = new Card[BOARD_SIZE][BOARD_SIZE];

        // get an array of all the images
        Images img [] = Images.values();
        // this generates random numbers
        Random random = new Random();
        // choose an image at random

        for (int i = 0; i < (BOARD_SIZE*BOARD_SIZE)/2; i++)
        {
            Images cardImage = img[random.nextInt(img.length)];
            addCardToBoard(new Card(cardImage));
            addCardToBoard(new Card(cardImage));
        }
    }

    public Card getCardAtPosition(Position position)
    {
        return board[position.getXCoordinate()][position.getYCoordinate()];
    }

    private void setCardAtPosition(Position position, Card newCard)
    {
        board[position.getXCoordinate()][position.getYCoordinate()] = newCard;
    }

    private void addCardToBoard(Card card)
    {
        Position position;
        do
        {
            position = Position.getRandomPosition(BOARD_SIZE);
        }
        while (getCardAtPosition(position) != null);

        setCardAtPosition(position, card);
    }

    public void displayBoard()
    {
        for (Card [] row: board)
        {
            System.out.print("| ");
            for (Card card: row)
            {
                System.out.print(card.getImage() + " | ");
            }
            System.out.println();
        }
    }

    public void setCardAsFound(Position position)
    {
        getCardAtPosition(position).setFound(true);
    }

}
