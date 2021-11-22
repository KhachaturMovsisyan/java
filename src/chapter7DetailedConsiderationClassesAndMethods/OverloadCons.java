package chapter7DetailedConsiderationClassesAndMethods;

public class OverloadCons {
    public static void main(String[] args) {
        Box myBox1=new Box(10,20,15);
        Box myBox2=new Box();
        Box mycube=new Box(10);

        double vol;

        vol=myBox1.volume();
        System. out .println ("Объем mybox1 равен " + vol);

        vol=myBox2.volume();
        System.out.println("Oбъeм mybox2 равен " + vol);

        vol=mycube.volume();
        System.out.println("Oбъeм mycube равен " + vol);

    }
}
