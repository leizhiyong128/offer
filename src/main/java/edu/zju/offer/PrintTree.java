package edu.zju.offer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class PrintTree {
    public ArrayList<ArrayList<Integer> > Print(TreeNode pRoot) {
        ArrayList<ArrayList<Integer> > res = new ArrayList<ArrayList<Integer> >();
        if(pRoot==null)return res;
        LinkedList<TreeNode> queue = new LinkedList<TreeNode>();
        ArrayList<Integer> list = new ArrayList<Integer>();
        queue.addLast(null);
        queue.addLast(pRoot);
        while(queue.size()!=1){
        	TreeNode t = queue.removeFirst();
        	if(t==null){
        		Iterator<TreeNode> iter = null;
        		iter = queue.iterator();
        		while(iter.hasNext()){
//        			list.add(iter.next().val);
        		}
        		res.add(new ArrayList<Integer>(list));
        		list.clear();
        		queue.addLast(null);
        		continue;
        	}
        	if(t.left!=null)queue.addLast(t.left);
        	if(t.right!=null)queue.addLast(t.right);
        }
        return res;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
