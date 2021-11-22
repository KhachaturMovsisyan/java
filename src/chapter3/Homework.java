package chapter3;

public class Homework {
    public static void main(String[] args) {
//Օգտագործել եմ պայմանի և ցիկլի օպերատորներ, կատարել եմ ստուգումներ․
        byte b = 20;
        int x = 50;

        int y = (byte) b;


        boolean c = true;
        c = x < y;
        if (c) {
            for (int i = 0; i < 5; i++) {
                System.out.println("5 անգամ իրազեկել որ " + c + " է");
            }

        } else {
            for (int i = 0; i < 5; i++) {
                System.out.println("5 անգամ իրազեկել որ " + c + " է");
            }

        }

    }
}
