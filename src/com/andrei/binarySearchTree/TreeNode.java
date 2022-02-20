package com.andrei.binarySearchTree;

public class TreeNode {

    private int data;
    private TreeNode leftChiled;
    private TreeNode rightChild;

    //when we construct a node it will be a leaf first so there will not be left and right child.
    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftChild() {
        return leftChiled;
    }

    public void setLeftChild(TreeNode leftChiled) {
        this.leftChiled = leftChiled;
    }

    public TreeNode getRightChild() {
        return rightChild;
    }

    public void setRightChild(TreeNode rightChild) {
        this.rightChild = rightChild;
    }

    @Override
    public String toString() {
        return "Data=" + data;
    }

    //we put first the method for Tree in TreeNode because each node can be a root for a subtree.

    public void insert(int value){
        //no duplicate value for this implementation
        if(value == data) {
            return;
        }

        if(value < data){
            if(leftChiled == null){
                leftChiled = new TreeNode(value);
            }
            else{
                leftChiled.insert(value);
            }
        }
        else {
            if(rightChild == null){
                rightChild = new TreeNode(value);
            }
            else{
                rightChild.insert(value);
            }
        }
    }

    //in-order traversal left, root , right. it will return a sorted array.
    //every node subtree in the left is printed  then the node then the right subtree.
    public void traversInOrder(){
        if(leftChiled != null){
            leftChiled.traversInOrder();
        }

        System.out.print( data + ", ");


        if(rightChild != null){
            rightChild.traversInOrder();
        }

    }


}
