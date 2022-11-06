package com.ds.tree;
// Binary Search Tree Implementation in Java

public class BinarySearchTree<T extends Comparable<T>> {

    private int count;
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
        count++;
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

    int size() {
        return count;
    }

    boolean search(T input) {
        return ifNodeExists(root, input);
    }
    boolean ifNodeExists( Node root, T input)
    {
        if (root == null)
            return false;

        if (root.key.equals(input))
            return true;

        // then recur on left subtree /
        boolean res1 = ifNodeExists(root.left, input);

        // node found, no need to look further
        if(res1==true) return true;

        // node is not found in left,
        // so recur on right subtree /
        boolean res2 = ifNodeExists(root.right, input);

        return res2;
    }

}