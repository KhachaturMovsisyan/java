package chapter5Operators;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "двa";
        switch (str) {
            case "один":
                System.out.println("oдин");
                break;
            case "два":
                System.out.println("двa");
                break;
            case "три":
                System.out.println("тpи");
                break;
            default:
                System.out.println("нe совпало)");
                break;
        }
    }
}