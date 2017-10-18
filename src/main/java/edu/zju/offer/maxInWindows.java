package edu.zju.offer;

import java.util.ArrayList;
import java.util.LinkedList;

public class maxInWindows {
    public ArrayList<Integer> maxInWindows(int [] num, int size)
    {
    	if(num==null ||size<1 || num.length<size)return null;
    	ArrayList<Integer> res = new ArrayList<Integer>();
    	LinkedList<Integer> queue = new LinkedList<Integer>();
    	for(int i = 0;i<num.length;i++){
    		while(!queue.isEmpty() && queue.peekLast()<num[i]){
    			queue.removeLast();
    		}
    		queue.addLast(i);
    		if(queue.peekFirst()==i-size){
    			queue.removeFirst();
    		}
    		if(i>=size-1){
    			res.add(num[queue.peekFirst()]);
    		}
    	}
    	return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
