package model;


import utilities.Images;

/**
 * Created by Bijin on 22-Nov-16.
 */

public class Card
{
    private Images image;
    private boolean found;

    public Card(Images image)
    {
        this.image = image;
        this.found = false;
    }

    public Images getImage()
    {
        return image;
    }

    public boolean isFound()
    {
        return found;
    }

    public void setFound(boolean found)
    {
        this.found = found;
    }
}
