package homework.braceChecker;

public class Stack {
    private int[] array = new int[20];
    private int size;

    public Stack() {
        size = -1;
    }

    public void push(int value) {
        if (size - 1 == array.length) {

        } else {
            array[++size] = value;
        }
    }

    public int pop() {
        if (size < 0) {

            return 0;
        } else {
            return array[size--];
        }
    }

    boolean isEmpty() {
        if (size == -1) {
            return true;
        }
        return false;
    }

}
