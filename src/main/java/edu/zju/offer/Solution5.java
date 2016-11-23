package edu.zju.offer;

import java.util.Stack;

public class Solution5 {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    //将1中数据全部入栈到2，再进行删除
    /*
    public int pop() {
    	while(!stack1.isEmpty()){
    		stack2.push(stack1.pop());
    	}
    	int top = stack2.pop();
    	while(!stack2.isEmpty()){
    		stack1.push(stack2.pop());
    	}
    	return top;
    }
    */
    //用1入栈，用2出栈，当2空时再将1中数据入栈到2
    public int pop() {
    	if(stack2.isEmpty()){
    		while(!stack1.isEmpty()){
    			stack2.push(stack1.pop());
    		}
    	}
    	return stack2.pop();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
