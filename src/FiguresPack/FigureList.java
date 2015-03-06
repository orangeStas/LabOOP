package FiguresPack;

import java.util.ArrayList;

/**
 * Created by OrangeUser on 3/6/2015.
 */
public class FigureList extends Figures {

    private static ArrayList<Figures> listOfFigures = new ArrayList<Figures>();

    public void insertFigure(Figures figure){
        listOfFigures.add(figure);
    }

    public Figures getFigure(int pos){
        return listOfFigures.get(pos);
    }

    public ArrayList<Figures> getListOfFigures(){
        return listOfFigures;
    }

}
