public class InheritanceAssignment extends Laptop {
    public InheritanceAssignment(String NAME, int PRICE, String PROCESSOR, int RAM, int HDD) {
        super(NAME, PRICE, PROCESSOR, RAM, HDD);
    }

    public static void main(String[] args) {
        Laptop lp= new Laptop("Lenova", 1000,"i3",2,500);
        System.out.println("Name: "+lp.NAME+ " Price: $"+lp.PRICE+ " Processor: "+lp.PROCESSOR+" Ram: "+lp.RAM+"GB"+" HDD: "+lp.HDD+"GB");

        Laptop lp1= new Laptop("Dell", 1500,"i5",4,1);
        System.out.println("Name: "+lp1.NAME+ " Price: $"+lp1.PRICE+ " Processor: "+lp1.PROCESSOR+" Ram: "+lp1.RAM+"GB"+" HDD: "+lp1.HDD+"TB");

        Laptop lp2= new Laptop("Sony", 2000,"i9",8,1);
        System.out.println("Name: "+lp2.NAME+ " Price: $"+lp2.PRICE+ " Processor: "+lp2.PROCESSOR+" Ram: "+lp2.RAM+"GB"+" HDD: "+lp2.HDD+"TB");
        }
    }


