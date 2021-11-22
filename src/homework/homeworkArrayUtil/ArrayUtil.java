package homework.homeworkArrayUtil;

public class ArrayUtil {
    void elementsOfArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    int max(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {

            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    int min(int[] array) {
        int min = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
            }
        }
        return min;
    }

    void pair(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    void odd(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                System.out.print(array[i] + " ");
            }
        }
    }

    int countPair(int[] array) {
        int countPair = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                countPair++;
            }
        }
        return countPair;
    }

    int countOdd (int[] array){
        int countOdd=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]%2!=0){
                countOdd++;
            }
        }
        return countOdd;
    }

    int countArray(int[]array){
        int countArray=0;
        for (int i = 0; i < array.length; i++) {
            countArray=array[i]+countArray;
        }
        return countArray;
    }


}
