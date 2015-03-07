package FiguresPack;

import java.awt.*;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class Line extends Figures {


    private int x2;
    private int y2;


    public Line(int x1, int y1, int x2, int y2) {
        this.x = x1;
        this.x2 = x2;
        this.y = y1;
        this.y2 = y2;
    }

    @Override
    public void paintFigure(Graphics g) {
        g.drawLine(x, y, x2, y2);
    }
}
