package chapter6IntroductionToClasses;

public class BoxDemo4 {
    public static void main(String[] args) {
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double volume;

        myBox1.width = 10;
        myBox1.height = 20;
        myBox1.depth = 15;

        myBox2.width = 3;
        myBox2.height = 6;
        myBox2.depth = 9;

        volume = myBox1.vol();
        System.out.println("Oбъeм равен " + volume);

        volume = myBox2.vol();
        System.out.println("Oбъeм равен " + volume);
    }
}
