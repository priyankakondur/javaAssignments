package newpackage;

public class Assignment {
    public static void main(String[] args) {
        printIntCharDouble();
        rectangleArea();
        productOf2Numbers();
        asciiValue();
        doubleToInt();
        AsciiToChar();
        intAndDoubleValue();
        squareOfNumber();
    }
         static void printIntCharDouble() {
        //print integer value
            int intnum = 45;
            System.out.println(intnum + " :is integer");
         //print double value
            double doublenum = 33.657546;
            System.out.println(doublenum + " :is double");
         //print character value
            char character = 'A';
            System.out.println(character + " :is character");
        }
        static void rectangleArea(){
        // initialize sides of rectangle
            int l=2, b=3;
        //calculate area of rectangle
            int area = l*b;
        //print area
            System.out.println("area of rectangle is : "+area);
        }
    static void productOf2Numbers(){
        // initialize 2 numbers
            float a=8.2f, b=6;
        //calculate product
            float product = a*b;
        //print product
            System.out.println("product of two numbers is : "+product);
    }
    static void asciiValue(){
        //read the char
            char ch = 'h';
        //convert char to ascii
            int ascii = ch;
        //print value
        System.out.println("ascii value of "+ch+ " is: "+ascii);
    }
    static void doubleToInt(){
        // read double value
        double dvalue=100.235;
        // convert to int
        int intvalue=(int)dvalue;
        //print int value
        System.out.println("int value of "+dvalue+ " is: "+intvalue);
    }
    static void AsciiToChar(){
        //read ascii value and convert to int
        char ch = 'd';
        int ascii = ch;
        System.out.println("ascii value of "+ch+ " is: "+ascii);
        int sum = ascii + 3;
        //convert the sum to char and print
        char charvalue = (char)sum;
        System.out.println("character equivalent of "+sum+ " is: "+charvalue);
    }
    static void intAndDoubleValue(){
        // read int value
        int a=5;
        //read double value
        double b= 6.2;
        //add and print value
        double c= a+b;
        System.out.println("sum of "+a+ " and "+b+ " is "+c);
    }
    static void squareOfNumber(){
        //read number
        double a=3.9;
        //calculate square and print
        double c=Math.pow(a,2);
        System.out.println("square of "+a+ " is: "+c);
    }
}
