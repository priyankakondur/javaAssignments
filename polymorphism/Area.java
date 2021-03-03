package polymorphism;

public class Area {
    public void printArea(int length, int breadth){
        int areaRect = length*breadth;
        System.out.println("Area of rectangle is: "+areaRect);
    }
    public void printArea(int side){
        int areaSquare = side*side;
        System.out.println("Area of square is: "+areaSquare);
    }

    public static void main(String[] args) {
        Area a = new Area();
        a.printArea(65);
        a.printArea(11,88);
    }
}
