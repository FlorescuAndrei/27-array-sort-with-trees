package com.andrei;

import com.andrei.binarySearchTree.BinarySerchTree;
import com.andrei.heap.HeapSort;

public class Main {

    public static void main(String[] args) {

        int[] intArray = {75,80,60,68,67,52,40,55};

        HeapSort heapSort = new HeapSort(intArray);

        BinarySerchTree binarySerchTree = new BinarySerchTree();

        System.out.println("Sort with Heap");

        //Transform the array into heap and print the heap
        heapSort.heapifyArray();

        //sort the heap and print sorted array
        heapSort.sort();


        System.out.println("\nSort with Binary Search Tree");

        //Transform the array into binary search tree
        binarySerchTree.arrayToTree(intArray);

        //Traverse the tree in-order
        binarySerchTree.traverseInOrder();
    }
}
