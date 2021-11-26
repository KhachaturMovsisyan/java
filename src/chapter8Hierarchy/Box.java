package chapter8Hierarchy;

public class Box {
    double width;
    double hegth;
    double depth;

    Box(Box ob){
        width=ob.width;
        hegth=ob.hegth;
        depth=ob.depth;
    }

    Box(double w, double h, double d){
        width=w;
        hegth=h;
        depth=d;
    }

    Box(){
        width=-1;
        hegth=-1;
        depth=-1;
    }

    Box(double len){
        width=hegth=depth=len;
    }
    double volume(){
        return width*hegth*depth;
    }
}
