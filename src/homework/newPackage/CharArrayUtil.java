package homework.newPackage;

public class CharArrayUtil {
    public static void main(String[] args) {
//        Ունենք հետևյալ մասիվը՝
//        1) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        ունենք նաև մի սինվոլ՝ char c = 'o';
//        Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char c = 'o';
        int count = 0;
        for (int i = 0; i < bolola.length; i++) {
            if (c == bolola[i]) {
                count++;
            }
        }
        System.out.println(count);


//        2) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        System.out.println(bolola[bolola.length / 2] + " " + bolola[bolola.length / 2 - 1]);


//        3) Ունենք հետևյալ մասիվը՝՝
//        char[] bolola = {'b','o','l','o','l','a'};
//        պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false

        char symbol = 'y';
        char symbol2 = 'l';
        if (bolola[bolola.length - 1] == symbol && bolola[bolola.length - 2] == symbol2) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }

//        4) Ունենք հետևյալ մասիվը՝
//        char[] bolola = {'b','a',b','o','l','a'};
//        Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
//        օր․ abcbob → true, b9b -> true, բայց ասենք bac-> false
        char[] babola = {'b', 'a', 'b', 'o', 'l', 'a'};
        boolean b = false;

        for (int i = 0; i < babola.length; i++) {
            if (babola[i] == 'b' && babola[i + 2] == 'b') {
                b=true;
            }
        }
        System.out.println(b);



//        5) Ունենք հետևյալ մասիվը՝
//        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
//        Տվյալ օրինակում կարող ենք կամայական քանակի պռաբելներ դնել թե սկզբից թե վերջից
//        չկենտրոնանաք որ երկու հատ է դրված։ Պետք է գրել կոդ, որը text մասիվից
//        կստանա char[] result մասիվ, որը կլինի նույն տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։

        char[] text = {' ',' ','b','a','r','e','v',' ',' '};
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





//
    }
}
