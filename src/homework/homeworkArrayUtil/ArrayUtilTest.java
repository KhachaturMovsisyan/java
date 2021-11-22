package homework.homeworkArrayUtil;

public class ArrayUtilTest {
    public static void main(String[] args) {
        ArrayUtil arrayUtil = new ArrayUtil();
        int[] array = {2, 5, 8, 10, 32,22,96,87, 22, 11, 66, 12, 30};
        System.out.println("մասիվի բոլոր թվերը");
        arrayUtil.elementsOfArray(array);

        System.out.println("մասիվի ամենամեծ թիվը");
        int maxOfArray = arrayUtil.max(array);
        System.out.println(maxOfArray);

        System.out.println("մասիվի ամենափոքր թիվը");
        int minOfArray = arrayUtil.min(array);
        System.out.println(minOfArray);

        System.out.println("մասիվի զույգ թվերը");
        arrayUtil.pair(array);

        System.out.println("մասիվի կենտ թվերը");
        arrayUtil.odd(array);
        System.out.println();

        System.out.println("մասիվի զույգ թվերի քանակը");
        int countPair = arrayUtil.countPair(array);
        System.out.println(countPair);

        System.out.println("մասիվի կենտ թվերի քանակը");
        int countOdd = arrayUtil.countOdd(array);
        System.out.println(countOdd);

        System.out.println("մասիվի թվերի գումարը");
        int countArray = arrayUtil.countArray(array);
        System.out.println(countArray);

        System.out.println("մասիվի թվերի միջին թվաբանականը");
        System.out.println(countArray / 5);

    }

}
