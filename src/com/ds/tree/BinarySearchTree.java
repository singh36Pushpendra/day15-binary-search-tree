package com.ds.tree;
// Binary Search Tree Implementation in Java

public class BinarySearchTree<T extends Comparable<T>> {

    /*
     * Class containing left and right child of current node and key value
     */
    class Node {
        T key;
        Node left, right;

        public Node(T item) {
            key = item;
            left = right = null;
        }
    }

    // Root of BST
    Node root;

    // This method mainly calls insertToTree()
    void insert(T key) {
        root = insertToTree(root, key);
    }

    /*
     * A recursive function to insert a new key in BST
     */
    Node insertToTree(Node root, T key) {

        /*
         * If the tree is empty, return a new node
         */
        if (root == null) {
            root = new Node(key);
            return root;
        }

        /* Otherwise, recur down the tree */
        if (key.compareTo(root.key) < 0)
            root.left = insertToTree(root.left, key);
        else if (key.compareTo(root.key) > 0)
            root.right = insertToTree(root.right, key);

        return root;
    }

}