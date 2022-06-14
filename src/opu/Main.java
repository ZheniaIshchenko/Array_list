package opu;

import opu.figures.*;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle(4,7);
        Rectangle rectangle2 = new Rectangle(5,8);
        Rectangle rectangle3 = new Rectangle(2,9.9);
        Rectangle rectangle4 = new Rectangle(3,7);
        Rectangle rectangle5 = new Rectangle(4,4);

        Parallelepiped parallelepiped1 = new Parallelepiped(4, 5, 3);
        Parallelepiped parallelepiped2 = new Parallelepiped(6, 7, 4);
        Parallelepiped parallelepiped3 = new Parallelepiped(2, 8, 4);
        Parallelepiped parallelepiped4 = new Parallelepiped(5, 9, 3);
        Parallelepiped parallelepiped5 = new Parallelepiped(6, 8, 6);
        Parallelepiped parallelepiped6 = new Parallelepiped(7, 3, 9);
        Parallelepiped parallelepiped7 = new Parallelepiped(5, 5, 5);

        Parallelepipeds parallelepipeds = new Parallelepipeds(7);
        parallelepipeds.addParallelepipeds(parallelepiped1);
        parallelepipeds.addParallelepipeds(parallelepiped2);
        parallelepipeds.addParallelepipeds(parallelepiped3);
        parallelepipeds.addParallelepipeds(parallelepiped4);
        parallelepipeds.addParallelepipeds(parallelepiped5);
        parallelepipeds.addParallelepipeds(parallelepiped6);
        parallelepipeds.addParallelepipeds(parallelepiped7);
        // Кількість кубів
        System.out.println("Кількість кубів: " +parallelepipeds.findeKube());

        Rectangles rectangles = new Rectangles(5);
        rectangles.addRectangle(rectangle1);
        rectangles.addRectangle(rectangle2);
        rectangles.addRectangle(rectangle3);
        rectangles.addRectangle(rectangle4);
        rectangles.addRectangle(rectangle5);
        // Середня площа прямокутників
        System.out.println("Середня площа прямокутників: " + rectangles.averageSquare());
        // Кількість прямокутників, площа яких більша за середню площу всіх прямокутників
        System.out.println("Кількість прямокутників, площа яких більша за середню площу всіх прямокутників: " + rectangles.moreThenAverageSquare());


        Figures figures = new Figures();

        figures.addFigure(rectangle1);
        figures.addFigure(rectangle2);
        figures.addFigure(parallelepiped1);
        figures.addFigure(parallelepiped2);

        System.out.println(figures.toString());
        figures.removeFigure(1);
        System.out.println(figures.toString());

        System.out.println(figures.getFigure(rectangle1));
        figures.getFigure(1);
        

    }
}
