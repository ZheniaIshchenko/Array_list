package opu.figures;

import java.util.ArrayList;

public class Figures {
    private ArrayList<Rectangle> figures;

    public boolean checkEmpty (){
        boolean result;
        result = figures.isEmpty()? false: true;
        return result;
    }
    public Figures(){
        figures = new ArrayList<>();
    }

    public void addFigure(Rectangle rectangle){
        figures.add(rectangle);
    }

    public Rectangle getFigure(int index){
        if (checkEmpty()){
            return figures.get(index);
        } else {
            return null;
        }
    }
    public Rectangle getFigure(Rectangle rectangle){
        if (checkEmpty()){
            if (figures.contains(rectangle)) {
                return figures.get(figures.indexOf(rectangle));
            } else {
                System.out.println("Object not exist in array list");
                return null;
            }
        } else {
            System.out.println("Array list is empty");
            return null;
        }
    }

    public void removeFigure(int index){
        if (checkEmpty()){
            index = (index > 0 || index < (figures.size()-1)) ? index : -1;
            figures.remove(index);
        }else {
            System.out.println("Array list is empty");
        }
    }
    public void removeFigure(Rectangle rectangle){
        if (checkEmpty()){
            if (figures.contains(rectangle)) {
                figures.remove(rectangle);
            } else {
                System.out.println("Object not exist in array list");
            }
        }else {
            System.out.println("Array list is empty");
        }
    }

    @Override
    public String toString() {
        return "Figures{" + figures + '}';
    }
}
