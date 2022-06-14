package opu.figures;

public class Rectangle {
    protected double side_wight;
    protected double side_long;

    public double getSide_wight() {
        return side_wight;
    }

    public double getSide_long() {
        return side_long;
    }

    public void setSide_wight(double side_wight) {
            try {
                if (side_wight > 0) {
                    this.side_wight = side_wight;
                } else {
                    System.out.println("Not correct wight. ");
                }
            } catch (Exception e) {
                System.out.println("Not correct wight. ");
            }
    }

    public void setSide_long(double side_long) {
        try {
            if (side_long > 0) {
                this.side_long = side_long;
            } else {
                System.out.println("Not correct wight. ");
            }
        } catch (Exception e) {
            System.out.println("Not correct wight. ");
        }

    }
    public Rectangle(double side_long, double side_wight){
        this.setSide_long(side_long);
        this.setSide_wight(side_wight);
    }
    @Override
    public String toString() {
        return  "Rectangle: " +
                "long="   + side_long +
                "; wight= " + side_wight;
    }

    public double diagonal(){
        double diagonal = 0;
        diagonal = Math.sqrt((side_long*side_long + side_wight*side_wight));
        diagonal = Math.round(diagonal*100);
        return diagonal/100;
    }

    public double perimeter(){
        double perimeter = 0;
        perimeter = 2*(side_wight + side_long);
        return perimeter;
    }

    public double square(){
        double square = 0;
        square = side_long * side_wight;
        return square;
    }
}

