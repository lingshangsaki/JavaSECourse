
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
public class Practice14
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Circle sun2;  //练习1-14

    /**
     * Constructor for objects of class Picture
     */
    public Practice14()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        wall = new Square();
        wall.moveVertical(80);
        wall.changeSize(100);
        wall.makeVisible();

        window = new Square();
        window.changeColor("black");
        window.moveHorizontal(20);
        window.moveVertical(100);
        window.makeVisible();

        roof = new Triangle();
        roof.changeSize(50, 140);
        roof.moveHorizontal(60);
        roof.moveVertical(70);
        roof.makeVisible();

        sun = new Circle();
        sun.changeColor("yellow");
        sun.moveHorizontal(180);
        sun.moveVertical(-10);
        sun.changeSize(60);
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

    //练习1-14
    public void addSun()
    {
        sun2 = new Circle();
        sun2.changeColor("black");
        sun2.moveHorizontal(30);
        sun2.moveVertical(-40);
        sun2.changeSize(60);
        sun2.makeVisible();
    }

    // 为练习1-15、1-16构造方法获取sun
    public Circle getSun()
    {
        return sun;
    }

    public static void main(String[] args) {
        Practice14 picture = new Practice14();
//        picture.setBlackAndWhite();
        picture.draw();
        picture.addSun();
    }

}