package FiguresPack;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class Circle extends Figures {

    private int width;
    private int height;

    private int x;
    private int y;

    public Circle(int  x, int  y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    public int getXCirc(){
        return x;
    }

    public int getYCirc(){
        return y;
    }

    public int getWidthCirc() {
        return width;
    }

    public int getHeightCirc(){
        return height;
    }
}
