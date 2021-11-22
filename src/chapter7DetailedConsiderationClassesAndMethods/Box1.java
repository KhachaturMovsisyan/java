package chapter7DetailedConsiderationClassesAndMethods;

public class Box1 {
    double width;
    double heigth;
    double depth;


    Box1(Box1 ob){
        width= ob.width;
        heigth=ob.heigth;
        depth=ob.depth;

    }

    Box1(double w, double h, double d){
        width=w;
        heigth=h;
        depth=d;
    }

    Box1(){
        width=-1;
        heigth=-1;
        depth=-1;
    }

    Box1(double len){
        width=heigth=depth=len;
    }

    double volume(){
        return width*heigth*depth;
    }



}

