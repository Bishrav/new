package b_class;

public class Rectangle {
    private int length;
    private int breadth;

    public Rectangle(int length, int breadth){
        this.breadth = breadth;
        this.length = length;
    }

    public int getLength() {
        return length;
    }
    
    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void Calculate(){
        System.out.println("The Area for Abhisheker is "+(length * breadth));
    }
}

