package chapter7DetailedConsiderationClassesAndMethods;

public class Overload2 {
    public static void main(String[] args) {
        OverlodDemo2 ob2=new OverlodDemo2();
        int i=88;

        ob2.test();
        ob2.test(10,20);
        ob2.test(i);
        ob2.test(123.2);


    }

}
