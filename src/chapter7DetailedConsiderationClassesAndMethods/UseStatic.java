package chapter7DetailedConsiderationClassesAndMethods;

public class UseStatic {
    static  int a =3;
    static int b;

    static  void met(int x){
        System.out.println("x= "+x);
        System.out.println("a= "+a);
        System.out.println("b= "+b);
    }
    static {
        System.out.println("Статический блок инициализирован.");
        b=a*4;
    }

    public static void main(String[] args) {
        met(42);
    }


}
