# 27-array-sort-with-trees
Sort an array using a Binary Search Tree and a Heap

**Sort with Binary Search Tree**  

More detail about Binary Search Tree data structure:   &emsp;   [25-BinarySearchTrees](https://github.com/FlorescuAndrei/25-BinarySearchTrees.git)

**Sort with Heap**  
-  Insert into evry element of the array into heap  
    -  Compare the new item against its parent  
    -  If the item is greater we swap it (for max heap)
    -  Rinse and repeat  
    
    -  Time complexity O(log<sub>2</sub>n)
-  Sort the heap
    -  The root has the largest value
    -  Swap root with last element in the array  
    -  Heapify the tree, but exclude the last node  
    -  Now second largest element is at the root
    -  Rinse and repeat  
    
    -  In-place algorithm.  
    -  Time complexity O(nlog<sub>2</sub>n). At each iteration of the loop O(n), we have to fix the heap O(log<sub>2</sub>n).   

After the sort the array is no longer a heap.

More details about Heap data structure:  &emsp;   [26-Heaps](https://github.com/FlorescuAndrei/26-Heaps.git)
