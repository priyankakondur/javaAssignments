package polymorphism;

 class Degree {
    public void getDegree(){
        System.out.println("I got degree");
    }

}
 class underGradDegree extends Degree{
     public void getDegree(){
         System.out.println("I got under graduation degree");
     }
}
class postGradDegree extends Degree{
    public void getDegree(){
        System.out.println("I got post grad degree");
    }
}
class main{
    public static void main(String[] args) {
        Degree d = new Degree();
        d.getDegree();
        Degree d1 = new underGradDegree();
        d1.getDegree();
        Degree d2 = new postGradDegree();
        d2.getDegree();

    }
}