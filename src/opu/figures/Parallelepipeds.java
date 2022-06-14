package opu.figures;

public class Parallelepipeds{
    private Parallelepiped[] parallelepipeds;

    private int currentNumber = -1;

    public Parallelepipeds(int countElements){
        this.parallelepipeds = new Parallelepiped[countElements];
    }
    public void addParallelepipeds(final Parallelepiped parallelepiped){
        currentNumber++;
        this.parallelepipeds[currentNumber] = parallelepiped;
    }

    public int findeKube(){
        int count = 0;
        for (Parallelepiped i: parallelepipeds) {
            if (i.getSide_long() == i.getHeight() && i.getSide_long() == i.getSide_wight()){
                count++;
            }
        }
        return count;
    }
}
