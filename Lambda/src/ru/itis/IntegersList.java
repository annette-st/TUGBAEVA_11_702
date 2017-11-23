package ru.itis;

public class IntegersList {
    public static int getMaxCount() {
        return MAX_COUNT;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public int getCount() {
        return count;
    }

    private static final int MAX_COUNT = 10;
    private int numbers[] = new int[MAX_COUNT];
    private int count = 0;

    public IntegersList() {
    }

    public void add(int i){
        numbers[count] = i;
        count++;
    }

    public IntegersList map(Function function) {
        IntegersList listMap = new IntegersList();
        for (int i = 0; i < getCount(); i++) {
            listMap.add(function.apply(numbers[i]));
        }
        return listMap;
    }

    public IntegersList filter(Predicate predicate) {
        IntegersList listTest = new IntegersList();
        for (int i = 0; i < getCount(); i++) {
            if (predicate.test(numbers[i])) {
                listTest.add(numbers[i]);
            }
        }
        return listTest;
    }

    public void printList() {
        for(int i = 0; i < getCount(); i++){
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }

}
