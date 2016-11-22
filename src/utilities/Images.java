package utilities;

/**
 * Created by Bijin on 22-Nov-16.
 */
public enum Images
{
    Book("images/cards/book.png"),
    City("images/cards/city.png"),
    Disk("images/cards/disk.png"),
    Frog("images/cards/frog.png"),
    Money("images/cards/money_bag.png"),
    Poke1("images/cards/poke_1.png"),
    Poke2("images/cards/poke_2.png"),
    Poke3("images/cards/poke_3.png"),
    Poke4("images/cards/poke_4.png"),
    Poke5("images/cards/poke_5.png"),
    Science("images/cards/science.png"),
    Shaka("images/cards/shaka.png"),
    Space("images/cards/space.png"),
    Train("images/cards/train.png");

    private final String imagePath;

    /**
     * @param path: Path to the image file.
     */
    private Images(final String path) {
        this.imagePath = path;
    }

    public String getValue() {
        return imagePath;
    }

}
