package utilities;

import java.util.Random;

/**
 * Created by Bijin on 22-Nov-16.
 */
public class Position
{

    private int xCoordinate;
    private int yCoordinate;

    public Position(int xCoordinate, int yCoordinate)
    {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public int getXCoordinate()
    {
        return xCoordinate;
    }

    public int getYCoordinate()
    {
        return yCoordinate;
    }

    public static Position getRandomPosition(int limit)
    {
        Random generator = new Random();
        int x = generator.nextInt(limit);
        int y = generator.nextInt(limit);
        return new Position(x, y);
    }

}
