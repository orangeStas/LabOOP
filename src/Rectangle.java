import java.awt.geom.Rectangle2D;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class Rectangle extends Figures{

    private int width;
    private int height;

    private int x;
    private int y;


    public Rectangle(int  x, int  y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }


    public int getXRect() {
        return x;
    }

    public int getYRect() {
        return y;
    }

    public int getWidthRect() {
        return width;
    }

    public int getHeightRect() {
        return height;
    }


}
