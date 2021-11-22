package chapter4operations;

public class OpBitEquals {
    public static void main(String[] args) {
        int а = 1;
        int b = 2;
        int с = 3;
        а |= 4;
        b >>= 1;
        с <<= 1;
        а ^= с;
        System.out.println("a =" + а);
        System.out.println("b =" + b);
        System.out.println("c =" + с);


    }
}