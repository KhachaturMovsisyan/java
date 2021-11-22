package chapter6IntroductionToClasses;

public class Box {
    double width;
    double height;
    double depth;

    void volume(){
        System.out.println("Oбъeм равен");
        System.out.println(width*height*depth);
    }

    double vol(){
        return height*depth*width;
    }

    void setDim(double w,double h,double d){
        width=w;
        height=h;
        depth=d;
    }

    Box(){
        width=10;
        height=10;
        depth=10;
    }




}
