package homework.newPackage;

public class ArrayUtil {
    public static void main(String[] args) {
        int[] array = {6, 9, 20, 80, 2, 5, 8, 10, 32, 22, 11, 66, 12, 30};
        // Տպեք մասիվի բոլոր էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        //Տպեք մասիվի ամենամեծ թիվը,
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        System.out.println(max);
        //Տպեք մասիվի ամենափոքրը թիվը,
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println(min);
        //Տպեք մասիվի բոլոր զույգ էլեմենտները,
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        // Տպեք մասիվի բոլոր կենտ էլեմենտները։

        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
        //Տպեք զույգերի քանակը։
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                count++;
            }
        }
        System.out.println(count);
        //Տպեք կենտերի քանակը
        int count2 = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                count2++;
            }
        }
        System.out.println(count2);
        //Տպեք մասիվի էլեմենտների գումարը։
        int countArray = 0;
        for (int i = 0; i < array.length; i++) {
            countArray = array[i] + countArray;
        }
        System.out.println(countArray);


        //Տպեք մասիվի բոլոր թվերի միջին թվաբանականը (բոլոր էլեմենտների գումարը / էլեմենտների քանակի վրա)
        System.out.println(countArray/array.length);

    }
}
