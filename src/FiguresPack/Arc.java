package FiguresPack;

/**
 * Created by OrangeUser on 22.02.2015.
 */
public class Arc extends Figures {

    private int x;
    private int y;
    private int width;
    private int height;
    private int startAngle;
    private int arcAngle;

    public Arc(int x, int y, int width, int height, int startAngle, int arcAngle){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
    }

    public int getXArc(){
        return x;
    }

    public int getYArc(){
        return y;
    }

    public int getWidthArc(){
        return width;
    }

    public int getHeightArc(){
        return height;
    }

    public int getStartAngleArc(){
        return startAngle;
    }

    public int getArcAngleArc(){
        return arcAngle;
    }
}
