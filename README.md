# 27-array-sort-with-trees
Sort an array using a Binary Search Tree and a Heap

**Sort with Binary Search Tree**   

-  Insert evry element of the array into Binary Search Tree. Build a Search Tree from the array's elements.
    -  Compare the new item against the root node  
    -  If is less than the root node we go to the left, if is greater, to the right 
    -  Repeat until we hit an empty spot and insert the node
    -  Time complexity to insert an element of the array O(log<sub>2</sub>n)  
    
-  Traverse in order
    -  Visit left child
    -  Then visit  the root, 
    -  Then right child.
    -  Every node left subtree will be printed out before print out the data for the node and then every node's right subtree
    
   
Binary Search Trees have faster searching then unsorted arrays do, but equivalent time complexity to sorted arrays O(log<sub>2</sub>n).  
We can do insertion, deletion and retrieve in O(log<sub>2</sub>n).

More detail about Binary Search Tree data structure:   &emsp;   [25-BinarySearchTrees](https://github.com/FlorescuAndrei/25-BinarySearchTrees.git)

**Sort with Heap**  
-  Insert evry element of the array into heap. Build a heap from the array's elements.
    -  Compare the new item against its parent  
    -  If the item is greater we swap it (for max heap)
    -  Rinse and repeat  
    -  Time complexity to insert an element of the array O(log<sub>2</sub>n)  
    
-  Sort the heap
    -  The root has the largest value
    -  Swap root with last element in the array  
    -  Heapify the tree, but exclude the last node  
    -  Now second largest element is at the root
    -  Rinse and repeat  
    -  In-place algorithm.  
    -  Time complexity O(nlog<sub>2</sub>n). At each iteration of the loop O(n), we have to fix the heap O(log<sub>2</sub>n).   


More details about Heap data structure:  &emsp;   [26-Heaps](https://github.com/FlorescuAndrei/26-Heaps.git)  


[BACK TO START PAGE](https://github.com/FlorescuAndrei/Start.git)
