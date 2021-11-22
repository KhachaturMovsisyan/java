package homework.arrayUtil;

public class SortArray {
    public static void main(String[] args) {
        //Պետք է սորտավորենք մասիվը
        int[] array = {8, 4, 6, 5, 1, 0, 2,7, 3, 9};
        int temp = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
