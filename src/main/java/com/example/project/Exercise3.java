package com.example.project;

public class Exercise3 {

    public static void main(String[] args) {
        Exercise3 obj = new Exercise3();

        BST<Integer> tree = new BST<Integer>();

        Integer array [] = {1, 2,3, 4, 5};

        for(Integer value : array){
            tree.insert(value);
        }

        System.out.print(obj.bstEstrictamenteBinario(tree));
        
    }


    public <T extends Comparable<T>> boolean bstEstrictamenteBinario(BST<T> a){    
        return nodoEstrictamentebinario(a.root);
    }
    
    public <T extends Comparable<T>> boolean nodoEstrictamentebinario(Node<T> n){
        if(n.left == null && n.right == null) {
            return true;
        }
        if(n.left == null && n.right != null || n.left != null && n.right == null) {
            return false;
        }
        return (nodoEstrictamentebinario(n.left) && nodoEstrictamentebinario(n.right));
    }
}
