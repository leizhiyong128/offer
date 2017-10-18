package edu.zju.offer;

import java.util.Stack;

public class KthNode {
    TreeNode KthNode(TreeNode pRoot, int k)
    {
        int index = 0;
        Stack<TreeNode> stack = new Stack<TreeNode>();
        TreeNode cur = pRoot;
        while(!stack.isEmpty() || cur !=null){
        	if(cur!=null){
        		stack.add(cur);
        		cur = cur.left;
        	}else{
        		cur = stack.pop();
            	index++;
            	if(index==k){
            		return cur;
            	}
            	cur = cur.right;
        	}
        	
        }
        return null;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
