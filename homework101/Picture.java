package homework101;

public class Picture

{

    private Square square;

    private Circle circle;



    /**

     * Constructor for objects of class Picture

     */

    public Picture()

    {

        // nothing to do... instance variables are automatically set to null

    }



    /**

     * Draw this picture.

     */

    public void draw()

    {

        square = new Square();

        square.moveVertical(80);

        square.changeSize(100);

        square.makeVisible();



        circle = new Circle();

        circle.changeColor("yellow");

        circle.moveHorizontal(180);

        circle.moveVertical(-10);

        circle.changeSize(60);

        circle.makeVisible();

    }



    /**

     * Change this picture to black/white display

     */

    public void setBlackAndWhite()

    {

        if(square != null)   // only if it's painted already...

        {

        	square.changeColor("black");

        	square.changeColor("black");

        }

    }



    /**

     * Change this picture to use color display

     */

    public void setColor()

    {

        if(square != null)   // only if it's painted already...

        {

        	square.changeColor("red");

            circle.changeColor("yellow");

        }

    }



    public static void main(String[] args) {

        Picture picture = new Picture();

//        picture.setBlackAndWhite();

        picture.draw();;

    }



}