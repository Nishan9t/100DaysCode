//   https://leetcode.com/problems/capacity-to-ship-packages-within-d-days



// import java.util.Arrays;
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] mergedArray = new int[l1 + l2];
        int l3 = mergedArray.length;
        // adding elements 
        for(int i = 0; i < l1; i++){
            mergedArray[i] = nums1[i];
        }
        for(int j = 0; j < l2; j++){
            for(int k = l1; k < l3; k++){
                mergedArray[k] = nums2[j];
                l1++;
                break;
            }
        }
        // Sorting elements
        // Arrays.sort(mergedArray);
        // Bubble Sort
        for(int i = 0; i < l3-1; i++){
            for(int j = 0; j < l3-i-1; j++){
                if(mergedArray[j] > mergedArray[j+1]){
                    //swap
                    int temp = mergedArray[j];
                    mergedArray[j] = mergedArray[j+1];
                    mergedArray[j+1] = temp;
                }
            }
        }
        // Returning Median
        int start = 0;
        int end = l3-1;
        int mid = start + ((end - start )/2);
        double m = mergedArray[mid];
        if( l3 % 2 == 0){
            start = mid;
            end = mid + 1; 
            m = ((mergedArray[start]) + (mergedArray[end]))/2f;
            return m;
        }
        System.out.println(m);
        return m;
    }
}


