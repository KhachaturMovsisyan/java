package homework.homeworkCharArray;

public class CharArrayTest {
    public static void main(String[] args) {
        CharArray charArray = new CharArray();
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        //Պետք է գրել լոգիկա, որը կհաշվի թե քանի հատ կա c-փոփոխականից մեր մասիվի մեջ, ու տպել այդ քանակը։
        int account = charArray.account(bolola);
        System.out.println(account);

        //        Պետք է գրել կոդ, որը կտպի մեջտեղի 2 սինվոլները։
        char midSymbol = charArray.midSymbol(bolola);
        char midSymbol1 = charArray.midSymbol1(bolola);
        System.out.print(midSymbol);
        System.out.println(midSymbol1);

        //        Պետք է տպենք true եթե մեր մասիվը վերջանում է ly-ով, եթե ոչ՝ false
        charArray.bool(bolola);

//Տպում ենք true եթե տեքստը պարունակում է bob բառը, բայց o-ի տեղը կարող է լինել ցանկացած սինվոլ։
        char[] bolola2 = {'b', 'a', 'b', 'o', 'l', 'a'};
        charArray.bob(bolola2);

        //Պետք է գրել կոդ, որը text մասիվից կստանա char[] result մասիվ, որը կլինի նույն
//        տեքստը, առանց պռաբելների(իրար կողք կտպի barev)։
        char[] text = {' ', ' ', 'b', 'a', 'r', 'e', 'v', ' ', ' '};
        charArray.text(text);
    }
}
