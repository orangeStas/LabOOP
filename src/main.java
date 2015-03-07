import FiguresPack.*;

import javax.swing.*;
import java.awt.*;

public class main extends JFrame {
    public main() {
        super("Figures");
        setSize(new Dimension(800, 600));
        setLocationRelativeTo(null);
        setLayout(new GridBagLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        FigureList list = new FigureList();
        list.insertFigure(new Circle(315, 50, 120, 100));
        list.insertFigure(new Circle(340, 80, 12, 12));
        list.insertFigure(new Circle(390, 80, 12, 12));
        list.insertFigure(new Arc(345, 100, 60, 30, 180, 170));
        list.insertFigure(new RoundRectangle(30,30, 200, 100, 10, 10));
        list.draw(g);
    }

    public static void main(String args[]) {
        main app = new main();
    }
}




