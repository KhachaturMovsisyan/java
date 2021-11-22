package homework.dinamicArray;

public class DinamicArray {

    //սա մեր հիմնական մասիվն է, որտեղ պահելու ենք ավելացվող էլեմենտները
    private int[] array = new int[10];
    //սա մեր մասիվի մեջ ավելացված էլեմենտների քանակն է
    private int size = 0;

    //ստուգել եթե մասիվի մեջ տեղ չկա-> կանչել extend()
    //և ավելացնենք
    public void add(int value) {

        if (size == array.length) {
            extend();
        } else {
            array[size] = value;
            size++;
        }
    }

    public void add(int[] numbers) {
        for (int number : numbers) {
            add(number);
        }
    }


    public void add(int value, int index) {
        if (size == array.length) {
            extend();
        }
        for (int i = size - 1; i >= index; i--) {
            array[i + 1] = array[i];
        }
        array[index] = value;
        size++;
    }

    public void set(int value, int index) {
        if (index < 0 || index > size) {
            System.out.println("invalid index");
        } else {
            array[index] = value;
        }
    }

    //1․ստեղծել հին մասիվից 10 էլեմենտ ավելի մեծ մասիվ
    //2․քցել հին մասիվի էլեմենտները նորի մեջ
    //3․հին մասիվի հղումը կապենք նոր մասիվի հղման հետ։
    private void extend() {
        int[] newArray = new int[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;
    }

    //եթե տրված ինդեքսը մեր ունեցած մասիվի ինդեքսի սահմաններում է, վերադարձնել
    //մասիվի index-երրորդ էլեմենտը։ Հակառակ դեպքում վերադարձնել -1։
    public int getByIndex(int index) {
        if (index < array.length) {
            System.out.println(array[index]);
            return array[index];
        } else {
            return -1;
        }
    }

    public void delete(int index) {
        if (index < 0 || index > size) {
            System.err.println("invalid index");
        }
        for (int i = index + 1; i < size; i++) {
            array[i - 1] = array[i];
        }
        size--;

    }


    //տպել մասիվի ավելացված էլեմենտները։
    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

    }

    public boolean isExist(int value){
        for (int i = 0; i < size; i++) {

        }
        if (size==value&&size==0){
            return true;
        }else return false;
    }

//    public boolean isEmpty(){
//        switch (size){
//            case add():
//        }
//    }



}
