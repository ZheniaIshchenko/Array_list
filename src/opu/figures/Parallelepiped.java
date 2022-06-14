package opu.figures;

public class Parallelepiped extends Rectangle{

    public Parallelepiped(double side_long, double side_wight, double height) {
        super(side_long, side_wight);
        this.setHeight(height);
    }
    private double height;

    public void setHeight(double height) {
        try {
            if (height > 0) {
                this.height = height;
            } else {
                System.out.println("Not correct wight. ");
            }
        } catch (Exception e) {
            System.out.println("Not correct wight. ");
        }

    }

    public double getHeight() {
        return height;
    }



    @Override
    public String toString() {
        return  "Parallelepiped: " +
                "wight= "  + side_wight +
              "; long="    + side_long +
              "; height: " + height ;
    }

    public double capacity(){
        double capacity = 0;
        capacity = super.getSide_long() * super.getSide_wight() * height;
        return capacity;
    }
    @Override
    public double square(){
        double square = 0;
        square = 2 * (super.side_long * super.side_wight + super.side_long * height + super.side_wight * height);
        return square;
    }
}
