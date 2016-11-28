package edu.zju.offer;

public class Solution6 {
    public int minNumberInRotateArray(int [] array) {
        int first = 0;
        int end = array.length-1;
        while(first<end){
        	int mid = first+(end-first)/2;
        	if(array[mid]>array[end]){
        		first = mid+1;
        	}
        	else if(array[mid]==array[end]){
        		end--;
        	}
        	else{
        		end = mid;
        	}
        }
        return array[first];
    }
}
