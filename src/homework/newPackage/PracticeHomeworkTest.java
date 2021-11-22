package homework.newPackage;

import homework.homeworkPractice.PracticeHomework;

public class PracticeHomeworkTest {
    public static void main(String[] args) {
        PracticeHomework2 pH2 = new PracticeHomework2();
        int[] numbers1 = new int[60];
        int[] numbers2 = new int[160];

        System.out.println(pH2.convert(20));
        System.out.println(pH2.calcAge(9));
        System.out.println(pH2.nextNumber(3));
        System.out.println(pH2.isSameNum(5, 954));
        System.out.println(pH2.lessThanOrEqualToZero(60));
        System.out.println(pH2.reverseBool(true));
        System.out.println(pH2.maxLength(numbers1,numbers2));
    }
}
