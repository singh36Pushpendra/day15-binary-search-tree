package com.ds.tree;

public class BSTMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Binary Search Tree Data Structure!");

        BinarySearchTree<Integer> tree = new BinarySearchTree<>();
        tree.insert(56);
        tree.insert(30);
        tree.insert(70);
        tree.insert(22);
        tree.insert(40);
        tree.insert(60);
        tree.insert(95);
        tree.insert(11);
        tree.insert(65);
        tree.insert(3);
        tree.insert(16);
        tree.insert(63);
        tree.insert(67);

        System.out.println("Size of tree: " + tree.size());
        System.out.println("Searching 63 in tree present? : " + tree.search(63));
    }
}
