package chapter6IntroductionToClasses;

public class BoxDemo {
    public static void main(String[] args) {
        Box myBox = new Box();
        double vol;
        myBox.height = 10;
        myBox.width = 20;
        myBox.depth = 15;
        vol= myBox.depth* myBox.height* myBox.width;
        System.out.println(vol);


    }
}
