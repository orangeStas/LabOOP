package FiguresPack;

import java.awt.*;

/**
 * Created by OrangeUser on 22.02.2015.
 */
public class Arc extends Figures {

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

    @Override
    public void paintFigure(Graphics g){
        g.drawArc(x, y, width, height, startAngle, arcAngle);
    }


}
