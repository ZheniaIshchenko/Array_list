package opu.figures;

public class Rectangles {
    private Rectangle[] rectangles;

    private int currentNumber = -1;
    public Rectangles(int countElements){
        this.rectangles = new Rectangle[countElements];
    }

    public void addRectangle(Rectangle rectangle){
        currentNumber++;
        rectangles[currentNumber] = rectangle;
    }

    public double averageSquare(){
        double averageSquare = 0;
        for (Rectangle i: rectangles){
            averageSquare = i.square() + averageSquare;
        }
        averageSquare = Math.round((averageSquare/(currentNumber+1))*100);
        return averageSquare/100;
    }

    public int moreThenAverageSquare(){
        int count = 0;
        for (Rectangle i:rectangles) {
            if (averageSquare()<i.square()){
                count++;
            }

        }
        return count;
    }
}
