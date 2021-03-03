package polymorphism;

public class PrintNumber {
    public void Number(int integerNum){
        System.out.println("Printing integer value: "+integerNum);
    }
    public void Number(String string){
        System.out.println("Printing string value: "+string);
    }
    public void Number(double doubleNum){
        System.out.println("Printing double value: "+doubleNum);
    }
    public void Number(boolean booleanNum){
        System.out.println("Printing boolean value: "+booleanNum);
    }
    public void Number(char charNum){
        System.out.println("Printing character value: "+charNum);
    }

    public static void main(String[] args) {
        PrintNumber pn = new PrintNumber();
        pn.Number(89);
        pn.Number(42.5454545);
        pn.Number("priya");
        pn.Number('t');
        pn.Number(true);
    }
}
