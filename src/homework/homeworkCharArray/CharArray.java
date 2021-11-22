package homework.homeworkCharArray;

public class CharArray {
    int account (char[] bolola){
        char c = 'o';
        int account = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                account++;
            }
        }
        return account;
    }

    char midSymbol (char[] bolola){
        char midSymbol = bolola[bolola.length / 2];

        return midSymbol;
    }

    char midSymbol1 (char[] bolola){
        char midSymbol1 = bolola[bolola.length / 2-1];

        return midSymbol1;
    }

    void   bool(char[] bolola){
        if (bolola[bolola.length - 1] == 'y' && bolola[bolola.length - 2] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    void bob (char[]bolola2){
        boolean x = false;
        for (int i = 0; i < bolola2.length - 2; i++) {
            if (bolola2[i] == 'b' && bolola2[i + 2] == 'b') {
                x = true;
                break;
            }
        }
        System.out.println(x);
    }


    void text(char[]text){
        int start = 0;
        int end = 0;
        for (int i = 0; i < text.length; i++) {
            if (text[i] != ' ') {
                start = i;
                break;
            }
        }
        for (int i = text.length - 1; i > 0; i--) {
            if (text[i] != ' ') {
                end = i;
                break;
            }
        }
        char[] result = new char[end - start + 1];
        for (int i = 0; i < result.length; i++) {
            result[i] = text[start];
            start++;
            System.out.print(result[i]);
        }
    }





}
