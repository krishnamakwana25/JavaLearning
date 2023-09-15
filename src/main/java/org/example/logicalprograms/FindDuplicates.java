package org.example.logicalprograms;

/**
 * find duplicate elements from array using two pointers
 */
public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1,2,34,5,5,43,21,46,7,34,2};
        int n = arr.length;
        int i =0, j = n-1;
        while(j>=i){
            if(arr[i] == arr[j]){
                System.out.println("duplicate element:- "+arr[i]);
                i++;
                j=n-1;
            }
            j--;
            if(i==j){
                j=n-1;
                i++;
            }
        }

    }
}
