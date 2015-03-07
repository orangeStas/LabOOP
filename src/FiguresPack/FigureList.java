package FiguresPack;

import com.sun.javafx.UnmodifiableArrayList;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * Created by OrangeUser on 3/6/2015.
 */
public class FigureList {

    private List<Figures> listOfFigures = new ArrayList<Figures>();

    public FigureList(){

    }

    public void insertFigure(Figures figure){
        listOfFigures.add(figure);
    }

    public Figures getFigure(int pos){
        return listOfFigures.get(pos);
    }

    public List<Figures> getListOfFigures(){
        return new UnmodifiableArrayList(listOfFigures.toArray(),listOfFigures.size());
    }

    public void draw(Graphics g){
        for (Figures figure : listOfFigures){
            figure.paintFigure(g);
        }

    }

}
