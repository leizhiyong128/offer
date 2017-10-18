package edu.zju.offer;

import java.util.ArrayList;

public class IsBalanced_Solution {
    boolean flag = true;
    public boolean IsBalanced_Solution(TreeNode root) {
        getDepth(root);
        return flag;
    }
    int getDepth(TreeNode root){
        if(!flag)return 0;
        if(root == null)return 0;
        int left = getDepth(root.left);
        int right = getDepth(root.right);
        if(Math.abs(left-right)>1)flag = false;
        return left>right?left+1:right+1;
    }
    
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> res = new ArrayList<Integer>();
		res.clear();
	}

}
