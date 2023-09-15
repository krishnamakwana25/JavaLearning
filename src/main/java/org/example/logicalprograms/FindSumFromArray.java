package org.example.logicalprograms;

import java.util.ArrayList;
import java.util.List;

public class FindSumFromArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        int k = 9;

        int start=0, end =0;
        List<Integer> list = new ArrayList<>();

        int maxLength = 0;

        for (int i = 0; i < array.length; i++) {

            maxLength += array[i];
            end = i;

            while(maxLength>k){
                maxLength-=array[start];
                start++;
            }
            if(maxLength == k){
                for (int j = start; j <= end; j++) {
                    list.add(array[j]);
                }
                break;
            }
        }
        int[] intArray = list.stream().mapToInt(Integer::intValue).toArray();
        // Print the resulting integer array
        for (int value : intArray) {
            System.out.print(value+" ");
        }
    }
}
