package com.andrei.binarySearchTree;

public class BinarySerchTree {

    private TreeNode root;


    private void insert(int value){
        if(root == null){
            root = new TreeNode(value);
        }
        else{
            root.insert(value);
        }

    }

    public void traverseInOrder(){
        if(root != null) {
            root.traversInOrder();
        }
    }

    public void arrayToTree(int[] array){
        for(int i = 0; i < array.length; i++){
            insert(array[i]);
        }
    }


}
