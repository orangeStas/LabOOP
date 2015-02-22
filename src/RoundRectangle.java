/**
 * Created by OrangeUser on 22.02.2015.
 */
public class RoundRectangle extends Figures {

    private int x;
    private int y;
    private int width;
    private int height;
    private int arcWidth;
    private int arcHeight;

    public RoundRectangle(int x, int y, int width, int height, int arcHeight, int arcWidth){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.arcHeight = arcHeight;
        this.arcWidth = arcWidth;
    }

    public int getXRoundRect(){
        return x;
    }

    public int getYRoundRect(){
        return y;
    }

    public int getWidthRoundRect(){
        return width;
    }

    public int getHeightRoundRect(){
        return height;
    }

    public int getArcWidthRoundRect(){
        return arcWidth;
    }

    public int getArcHeightRoundRect(){
        return arcHeight;
    }

}
