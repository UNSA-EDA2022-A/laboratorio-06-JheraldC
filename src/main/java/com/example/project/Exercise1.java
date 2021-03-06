package com.example.project;

public class Exercise1 {

    public static void main(String[] args) {
        Exercise1 obj = new Exercise1();

        BST<Integer> tree1 = new BST<Integer>();
        BST<Integer> tree2 = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree1.insert(value);
            tree2.insert(value);
        }

        System.out.print(obj.bstSimilares(tree1, tree2));
        
    }

    public <T extends Comparable<T>> boolean bstSimilares(BST<T> a1, BST<T> a2) {
        if (a1.isEmpty() && a1.isEmpty()) {
            return true;
        } else if (a1.isEmpty() || a2.isEmpty()) {
            return false;
        } else {
            return bstSimilares(a1.root, a2.root);
        }
   }

    public <T extends Comparable<T>> boolean bstSimilares(Node<T> n1, Node<T> n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        else if (n1 != null && n2 == null || (n1 == null && n2 != null)) {
            return false;
        }
            return bstSimilares(n1.left, n2.left) && bstSimilares(n1.right, n2.right);
    }
}
