package homework.homeworkPractice;

public class PracticeHomeworkDemo {
    public static void main(String[] args) {
        PracticeHomework practiceHomework = new PracticeHomework();
        int[] numbers1 = new int[55];
        int[] numbers2 = new int[100];

        System.out.println(practiceHomework.convert(14));
        System.out.println(practiceHomework.calcAge(2));
        System.out.println(practiceHomework.nextNumber(7));
        System.out.println(practiceHomework.isSameNum(88, 5));
        System.out.println(practiceHomework.lessThanOrEqualToZero(-8));
        System.out.println(practiceHomework.reverseBool(false));
        System.out.println(practiceHomework.maxLength(numbers1,numbers2));
    }
}
