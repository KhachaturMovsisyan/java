package homework.arrayUtil;

public class Arrayutil {
    public static void main(String[] args) {
        // Տպեք մասիվի բոլոր էլեմենտները,
        String text = "մասիվի բոլոր էլեմենտները ";
        int[] array = {2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        for (int i = 0; i < array.length; i++) {
            text += array[i] + " ";
        }
        System.out.print(text);
        System.out.println();
        // Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.print("մասիվի ամենամեծ թիվը " + max);
        System.out.println();
        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.print("մասիվի ամենափոքր թիվը " + min);
        System.out.println();

        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        String text1 = "մասիվի զույգ թվերը ";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                text1 += array[i] + " ";
            }
        }
        System.out.print(text1 + " ");
        System.out.println();

        //  Տպեք մասիվի բոլոր կենտ էլեմենտները,

        String text2 = "մասիվի կենտ թվերը ";
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                text2 += array[i] + " ";
            }
        }
        System.out.print(text2 + " ");

        System.out.println();

        // Տպեք զույգերի քանակը,
        int countPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countPair++;
            }
        }
        System.out.print("մասիվի զույգ էլեմենտների թիվը " + countPair);
        System.out.println();

        //Տպեք կենտերի քանակը,
        int countOdd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                countOdd++;
            }
        }
        System.out.print("մասիվի կենտ էլեմենտների թիվը " + countOdd + " ");
        System.out.println();


        //Տպեք մասիվի էլեմենտների գումարը,
        int countArray = 0;
        for (int i = 0; i < array.length; i++) {
            countArray = array[i] + countArray;
        }
        System.out.println("մասիվի էլեմենտների գումարը " + countArray);

        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը։
        System.out.println("մասիվի էլեմենտների միջին թվաբանականը " + countArray / array.length);


    }
}
