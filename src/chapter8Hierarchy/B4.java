package chapter8Hierarchy;

public class B4 extends A4 {
    int k;

    B4(int a, int b, int c) {
        super(a, b);
        k = c;
    }



    void show(String msg) {

        System.out.println(msg + k);
    }
}
