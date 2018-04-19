package ru.itis;

public class Main {

    public static void main(String[] args) {
        int array[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 6};
        int array1[] = {5, 4, 8, 2, 5, 6, 10, 1, 3, 6, 7, 6};

        TreeBstImpl<Integer> tree = new TreeBstImpl<>();
        TreeBstImpl<Integer> tree1 = new TreeBstImpl<>();

        for (int i : array) {
            tree.insert(i);
        }

//        for (int i : array1) {
//            tree1.insert(i);
//        }

//        System.out.println(tree.getRoot());

        tree.printByLevels();

    }
}

