import javax.swing.*;
import java.awt.*;

/**
 * Created by OrangeUser on 21.02.2015.
 */
public class main {
    public static void main(String [] args){
        initializeForm();
    }

    public static void initializeForm(){
        JFrame frame = new JFrame();
        frame.setTitle("Figures");
        frame.setSize(new Dimension(800, 600));
        frame.setLocationRelativeTo(null);
        frame.setLayout(new GridBagLayout());
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Figures figures = new Figures();
        //body
        figures.insertFigure(new RoundRectangle(300,130,150,200, 50,40));

        //head
        figures.insertFigure(new Circle(315, 20, 120, 100));
        figures.insertFigure(new Circle(340, 50, 12, 12));
        figures.insertFigure(new Circle(390, 50, 12, 12));
        figures.insertFigure(new Arc(345, 70, 60, 30, 180,  170));

        //legs
        figures.insertFigure(new RoundRectangle(300,335, 40, 190, 20, 20));
        figures.insertFigure(new RoundRectangle(410,335, 40, 190, 20, 20));

        //left hand
        figures.insertFigure(new Line(300,140, 120, 160));
        figures.insertFigure(new Line(300,170, 120, 180));
        figures.insertFigure(new Circle(100,155, 20, 30));
        figures.insertFigure(new Arc(100, 140, 7, 30, 0, 200));


        for (Figures figure : figures.getListOfFigures()){
            frame.add(figures.drawFigure(figure), new GridBagConstraints(0, 0, 1, 1, 1, 1, GridBagConstraints.NORTH
                    , GridBagConstraints.BOTH, new Insets(2, 2, 2, 2), 0, 0));
            System.out.println(figures.getFigureName(figure));
        }

        frame.setVisible(true);

    }
}
