package chapter7DetailedConsiderationClassesAndMethods;

public class PassOb {
    public static void main(String[] args) {
        Test ob1 = new Test(100, 22);
        Test ob2 = new Test(100, 22);
        Test ob3 = new Test(-1, -1);

        System.out.println("ob1==ob2: " + ob1.equalTo(ob2));
        System.out.println("ob1==ob3: " + ob1.equalTo(ob3));

//        String a = "Abg";
//        String b = "Abg";
//        boolean equals = a.equals(b);
//        System.out.println(equals);

        int [] aray = {0,1,2,3,-5};
        int [] araymek = {0,1,2,3,-5};

        boolean eq = aray.equals(araymek);
        System.out.println(eq);



    }
}
