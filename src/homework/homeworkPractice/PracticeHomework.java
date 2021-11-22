package homework.homeworkPractice;

public class PracticeHomework {
    //փոխակերպել տրված րոպեն վայրկյանի ու վերադարձնել
    public long convert(int minutes) {
        long convert = minutes * 60;
        return convert;
    }

    //ընդունել տարին, վերադարձնել օրերի քանակը։
    int calcAge(int years) {
        int calcAge = years * 365;
        return calcAge;
    }

    //վերադարձնել տրված թվի հաջորդ թիվը
    int nextNumber(int number) {
        int nextNumber = number + 1;
        return nextNumber;
    }

    //վերադարձնել true եթե տրված a և b թվերը իրար հավասար են, եթե ոչ՝ false
    boolean isSameNum(int a, int b) {
        if (a == b) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել true-եթե թիվը փոքր կամ հավասար է 0-ին։
    //մնացած դեպքերում վերադարձնել false
    boolean lessThanOrEqualToZero(int num) {
        if (num <= 0) {
            return true;
        } else {
            return false;
        }
    }

    //վերադարձնել ընդունող բուլյանի ժխտված արժեքը։
    boolean reverseBool(boolean value) {
        return !value;
    }

    //վերադարձնել երկու մասիվի ամենամեծ length-ը
    int maxLength(int[] array1, int[] array2) {
        if (array1.length> array2.length){
            return array1.length;
        }else {
            return array2.length;
        }

    }

}