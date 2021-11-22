package homework.arrayUtil;

public class CharArrayutil {
    public static void main(String[] args) {

//        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int account = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (bolola[i] == c) {
                account++;
            }
        }
        System.out.println("account-" + account);
        System.out.println();


//        Պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char[] programa = {'p', 'r', 'o', 'g', 'r', 'a', 'm', 'a'};
        char midSymbol1 = programa[programa.length / 2];
        char midSymbol2 = programa[programa.length / 2 - 1];
        System.out.println("symbols in the middle of the array-" + midSymbol1 + "," + midSymbol2);


//
//        Պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        char[] bolola2 = {'b', 'o', 'l', 'o', 'l', 'a'};
        if (bolola2[bolola2.length - 1] == 'y' && bolola2[bolola2.length - 2] == 'l') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }


//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։

        char[] bolola3 = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean x = false;
        for (int i = 0; i < bolola3.length - 2; i++) {
            if (bolola3[i] == 'b' && bolola3[i + 2] == 'b') {
                x = true;
                break;
            }
        }
        System.out.println(x);


// Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն
//        տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
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

