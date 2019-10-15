
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square floor;
    private Square sky;
    private Square roof;
    private Square roof2;
    private Square roof3;
    private Square roof4;
    private Square roof5;
    private Square window;
    private Triangle roofedge;
    private Triangle roofedge2;
    private Circle sun;
    private Triangle walkway;

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
        
        
        wall = new Square();
        wall.moveHorizontal(60);
        wall.moveVertical(130);
        wall.changeSize(75);
        wall.makeVisible();
        
        wall2 = new Square();
        wall2.moveHorizontal(135);
        wall2.moveVertical(130);
        wall2.changeSize(75);
        wall2.makeVisible();
        
        roof = new Square();
        roof.moveHorizontal(175);
        roof.moveVertical(115);
        roof.changeSize(30);
        roof.changeColor("black");
        roof.makeVisible();
        
        roof2 = new Square();
        roof2.moveHorizontal(65);
        roof2.moveVertical(115);
        roof2.changeSize(30);
        roof2.changeColor("black");
        roof2.makeVisible();
        
        roof3 = new Square();
        roof3.moveHorizontal(120);
        roof3.moveVertical(115);
        roof3.changeSize(30);
        roof3.changeColor("black");
        roof3.makeVisible();
        
        roof4 = new Square();
        roof4.moveHorizontal(95);
        roof4.moveVertical(115);
        roof4.changeSize(30);
        roof4.changeColor("black");
        roof4.makeVisible();
        
        roof5 = new Square();
        roof5.moveHorizontal(145);
        roof5.moveVertical(115);
        roof5.changeSize(30);
        roof5.changeColor("black");
        roof5.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();
        
        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roofedge = new Triangle();
        roofedge.changeSize(30,40);
        roofedge.moveHorizontal(65);
        roofedge.moveVertical(115);
        roofedge.changeColor("black")
        roof.makeVisible();
       
        roofedge2 = new Triangle();
        roofedge2.changeSize(30,40);
        roofedge2.moveHorizontal(205);
        roofedge2.moveVertical(115);
        roofedge2.changeColor("black")
        roofedge2.makeVisible();
       

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(20);
        sun.moveVertical(20);
        sun.changeSize(35);
        sun.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            sun.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            sun.changeColor("yellow");
        }
    }

}
