package FiguresPack;

import java.awt.*;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public abstract class Figures {

    protected int x;
    protected int y;
    protected int width;
    protected int height;

    public final String getFigureName(){
        return this.getClass().toString().split(" ")[1];
    }

    public abstract void paintFigure(Graphics g);
}
