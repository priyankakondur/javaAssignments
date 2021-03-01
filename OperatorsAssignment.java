public class OperatorsAssignment {
    public static void main(String[] args) {
        areaPerimeterOfRectangle();
        perimeterOfTriangle();
        fahrenheitToCelsius();
    }
        static void areaPerimeterOfRectangle(){
            //read length and breadth of rectangle
        int l = 5, b=7;
        //calculate and print area
        int area = l*b;
            System.out.println("area of rectangle is: "+area);
        //calculate and print perimeter
        int perimeter = 2*(l+b);
            System.out.println("permiter of rectangle is: "+perimeter);

        }
        static void perimeterOfTriangle(){
        //read sides of triangle
            int a=2,b=3,c=5;
        //calculate perimeter and print value
            int perimeter = a+b+c;
            System.out.println("perimeter of triangle is: "+perimeter);
        }
        static void fahrenheitToCelsius(){
        //read fahrenheit value
            double fahrenheit = 50.0;
        //convert to celsius and print
            double celsius = (fahrenheit-32)/1.8;
            System.out.println("celsius value of "+fahrenheit+" farenheit is: "+celsius);
        }
}
