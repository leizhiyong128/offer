package edu.zju.offer;

import java.util.Stack;

public class Solution21 {
    public boolean IsPopOrder(int [] pushA,int [] popA) {
    	int length = pushA.length;
    	if(length == 0 )return true;
    	Stack<Integer> stack = new Stack<Integer>();
    	int n=0;
    	for(int i = 0;i<length ;i++){
    		while(stack.isEmpty() || stack.peek()!= popA[i]){
    			if(n<length){
        			stack.push(pushA[n++]);
    			}else{
    				return false;
    			}
    		}
    		stack.pop();
    	}
        return true;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
