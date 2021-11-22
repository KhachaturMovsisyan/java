package homework.dinamicArray;

public class DinamicArrayTest {
    public static void main(String[] args) {
        DinamicArray da = new DinamicArray();
        for (int i = 0; i < 10; i++) {
            da.add(i + 1);
        }

        int[] numbers = {11, 22, 33, 44, 55};
        da.add(numbers);
        da.print();


        System.out.println(da.isExist(99));
        System.out.println(da.isExist(5));
//        System.out.println(da.isEmpty());
//        da.print();
//        da.delete(6);
//        System.out.println();
//        da.print();
//        da.set(12, 5);
//        System.out.println();
//        da.print();
//        da.add(13, 6);
//        System.out.println();
//        da.print();

    }
}
