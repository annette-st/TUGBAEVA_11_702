package ru.itis;

import java.util.LinkedList;
import java.util.Queue;

public class TreeBstImpl<T extends Comparable<T>> implements Tree<T> {
    class Node {
        private T value;
        private Node left;
        private Node right;

        public T getValue() {
            return value;
        }

        Node(T value) {
            this.value = value;
        }
    }

    public T getRoot() {
        return root.getValue();
    }

    private Node root;


    public TreeBstImpl() {
        this.root = null;
    }

    public void insert(T value) { // оболочка
        this.root = insert(root, value);
    }

    public void print() { // оболочка
        print(root);
    }



    private void print(Node root) {
        if (root != null) {
            print(root.left);
            System.out.print(root.value + " ");
            print(root.right);
        }
    }

    private Node insert(Node root, T value) {
        if (root == null) {
            root = new Node(value);
        } else if (value.compareTo(root.value) <= 0) {
            root.left = insert(root.left, value);
        } else {
            root.right = insert(root.right, value);
        }
        return root;
    }

    //TODO:
    public boolean remove(T value) {
        return false;
    }

    //TODO:
    @Override
    public boolean contains(T value) {
        Node tempNode = root;

        if (tempNode == null)
            return false;

        while (tempNode != null) {
            if (tempNode.value.compareTo(value) == 0)
                return true;
            else if (tempNode.value.compareTo(value) > 0)
                tempNode = tempNode.left;
            else
                tempNode = tempNode.right;
        }
        return false;
    }

    //TODO:
    @Override
    public void printByLevels() {
        if (root == null) {
            System.out.println("The tree has no nodes");
            return;
        }
    }


    //TODO
    @Override
    public boolean isBst() {
        return isBst(root);
    }

    private boolean isBst(Node currNode) {
        if (currNode != null) {
            if ((currNode.left != null && currNode.value.compareTo(currNode.left.value) < 0) || (currNode.right != null && currNode.value.compareTo(currNode.right.value) >= 0)) {
                return false;
            } else {
                isBst(currNode.right);
                isBst(currNode.left);
            }
        }
        return true;
    }

    //TODO:
    public boolean equals(TreeBstImpl<T> tree) {
        Node rootNode = tree.root;
        Node currNode = root;
        return equals(rootNode, currNode);
    }

    private boolean equals(Node rootNode, Node currNode) {
        try {
            if (rootNode == null && currNode == null)
                return true;
            else if (rootNode.value.compareTo(currNode.value) == 0)
                return equals(rootNode.left, currNode.left) && equals(rootNode.right, currNode.right);
            return false;
        } catch (NullPointerException e) {
            return false;
        }
    }
}
