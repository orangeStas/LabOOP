import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public  class Figures extends JPanel {
    private static ArrayList<Figures> listOfFigures = new ArrayList<Figures>();

    private Line line;
    private Rectangle rectangle;
    private Circle circle;
    private RoundRectangle roundRectangle;
    private Arc arc;

    public Figures(){}


    public Figures(Line line){
        this.line = line;
    }
    public Figures(Rectangle rectangle){
        this.rectangle = rectangle;
    }

    public Figures(Circle circle){
        this.circle = circle;
    }

    public Figures(RoundRectangle roundRectangle){
        this.roundRectangle = roundRectangle;
    }

    public Figures(Arc arc){
        this.arc = arc;
    }



    public void insertFigure(Figures figure){
        listOfFigures.add(figure);
    }

    public Figures getFigure(int pos){
        return listOfFigures.get(pos);
    }

    public String getFigureName(Figures figure){
        return figure.getClass().toString().split(" ")[1];
    }


    public ArrayList<Figures> getListOfFigures(){
        return listOfFigures;
    }

    Figures drawFigure(Figures figure){
        if (figure.getClass() == Line.class) {
            Figures paint = new Figures((Line)figure);
            return paint;
        }

        else if (figure.getClass() == Rectangle.class) {
            Figures paint = new Figures((Rectangle) figure);
            return paint;
        }

        else if (figure.getClass() == Circle.class) {
            Figures paint = new Figures((Circle)figure);
            return paint;
        }

        else if (figure.getClass() == RoundRectangle.class) {
            Figures paint = new Figures((RoundRectangle) figure);
            return paint;
        }

        else if (figure.getClass() == Arc.class) {
            Figures paint = new Figures((Arc) figure);
            return paint;
        }

        return null;

    }

    @Override
    public void paintComponent(Graphics g ){
        Graphics2D g2 = (Graphics2D) g;
        if (this.line != null)
            g2.drawLine(line.getX1Line(), line.getY1Line(), line.getX2Line(), line.getY2Line());

        else if (this.rectangle != null)
            g2.drawRect(rectangle.getXRect(), rectangle.getYRect(), rectangle.getWidthRect(), rectangle.getHeightRect());

        else if (this.circle != null)
            g2.drawOval(circle.getXCirc(), circle.getYCirc(), circle.getWidthCirc(), circle.getHeightCirc());

        else if (this.roundRectangle != null)
            g2.drawRoundRect(roundRectangle.getXRoundRect(), roundRectangle.getYRoundRect(), roundRectangle.getWidthRoundRect(), roundRectangle.getHeightRoundRect(),
                    roundRectangle.getArcWidthRoundRect(), roundRectangle.getArcHeightRoundRect());

        else if (this.arc != null)
            g2.drawArc(arc.getXArc(), arc.getYArc(), arc.getWidthArc(), arc.getHeightArc(), arc.getStartAngleArc(), arc.getArcAngleArc());
    }

}
