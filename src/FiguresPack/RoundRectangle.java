package FiguresPack;

import java.awt.*;

/**
 * Created by OrangeUser on 22.02.2015.
 */
public class RoundRectangle extends Figures {


    private int arcWidth;
    private int arcHeight;

    public RoundRectangle(int x, int y, int width, int height, int arcWidth, int arcHeight){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.arcHeight = arcHeight;
        this.arcWidth = arcWidth;
    }


    @Override
    public void paintFigure(Graphics g) {
        g.drawRoundRect(x, y, width, height, arcWidth, arcHeight);
    }
}
