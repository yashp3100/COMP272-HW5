package HW5; /******************************************************************
 *
 *   YOUR NAME / SECTION NUMBER
 *   Yash Patel - 001
 *   This java file contains the problem solutions of isSubSet, findKthLargest,
 *   and sort2Arrays methods. You should utilize the Java Collection Framework for
 *   these methods.
 *
 ********************************************************************/

import java.util.*;

class ProblemSolutions {

    /**
     * Method: isSubset()
     *
     * Given two arrays of integers, A and B, return whether
     * array B is a subset if array A. Example:
     *      Input: [1,50,55,80,90], [55,90]
     *      Output: true
     *      Input: [1,50,55,80,90], [55,90, 99]
     *      Output: false
     *
     * The solution time complexity must NOT be worse than O(n).
     * For the solution, use a Hash Table.
     *
     * @param list1 - Input array A
     * @param list2 - input array B
     * @return      - returns boolean value B is a subset of A.
     */

    public boolean isSubset(int list1[], int list2[]) {
        Set<Integer> set = new HashSet<>();

        //Add all elements to list1
        for(int num : list1){
            set.add(num);
        }

        //Check to see if the number exists in list2
        for(int num : list2){
            if(!set.contains(num)){
                return false;
            }
        }
        // ADD YOU CODE HERE -- DON'T FORGET TO ADD YOR NAME AT TOP OF FILE
        return true;
    }


    /**
     * Method: findKthLargest
     *
     * Given an Array A and integer K, return the k-th maximum element in the array.
     * Example:
     *      Input: [1,7,3,10,34,5,8], 4
     *      Output: 7
     *
     * @param array - Array of integers
     * @param k     - the kth maximum element
     * @return      - the value in the array which is the kth maximum value
     */

    public int findKthLargest(int[] array, int k) {
        PriorityQueue<Integer> heap = new PriorityQueue<>();

        for(int num : array){
            heap.add(num);
            if(heap.size() > k){
                heap.poll();
            }
        }
        // ADD YOUR CODE HERE

        return heap.peek();
    }


    /**
     * Method: sort2Arrays
     *
     * Given two arrays A and B with n and m integers respectively, return
     * a single array of all the elements in A and B in sorted order. Example:
     *      Input: [4,1,5], [3,2]
     *      Output: 1 2 3 4 5
     *
     * @param array1    - Input array 1
     * @param array2    - Input array 2
     * @return          - Sorted array with all elements in A and B.
     */

    public int[] sort2Arrays(int[] array1, int[] array2) {
        List<Integer> List = new ArrayList<>();

        // Add elements from both arrays to the list
        for (int num : array1) {
            List.add(num);
        }
        for (int num : array2) {
            List.add(num);
        }

        // Sort the combined list
        Collections.sort(List);

        // Convert list back to an array
        int[] result = new int[List.size()];
        for (int i = 0; i < List.size(); i++) {
            result[i] = List.get(i);
        }

        return result;
    }

        // ADD YOU CODE HERE
    }
