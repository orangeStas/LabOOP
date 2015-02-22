import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class Line extends Figures{

    private int x1;
    private int y1;
    private int x2;
    private int y2;


    public Line(int x1, int y1, int x2, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }

    public int getX1Line() {
        return x1;
    }

    public int getY1Line() {
        return y1;
    }

    public int getX2Line() {
        return x2;
    }

    public int getY2Line() {
        return y2;
    }


}
