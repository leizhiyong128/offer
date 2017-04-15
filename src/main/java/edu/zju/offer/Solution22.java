package edu.zju.offer;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

 class TreeNode1 {
    int val = 0;
    TreeNode1 left = null;
    TreeNode1 right = null;

    public TreeNode1(int val) {
        this.val = val;

    }

}
public class Solution22 {
    public ArrayList<Integer> PrintFromTopToBottom(TreeNode1 root) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	Queue<TreeNode1> listNode = new LinkedList<TreeNode1>();

    	if(root == null) return list;
    	listNode.add(root);
    	while(!listNode.isEmpty()){
    		TreeNode1 node = listNode.poll();
    		list.add(node.val);
    		if(node.left!=null)listNode.add(node.left);
    		if(node.right!=null)listNode.add(node.right);
    	}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
