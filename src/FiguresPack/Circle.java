package FiguresPack;

import java.awt.*;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class Circle extends Figures {

    public Circle(int  x, int  y, int width, int height){
        this.x = x;
        this.y = y;
        this.height = height;
        this.width = width;
    }

    @Override
    public void paintFigure(Graphics g) {
        g.drawOval(x, y, width, height);
    }
}
