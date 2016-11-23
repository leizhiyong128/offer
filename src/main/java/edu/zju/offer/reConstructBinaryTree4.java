package edu.zju.offer;

class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }
}
public class reConstructBinaryTree4 {
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        return help(pre, in, 0, pre.length-1, 0, in.length-1);
    }
    public TreeNode help(int[] pre,int[] in,int pre1,int pre2,int in1,int in2){
    	if(pre1>pre2 || in1>in2)return null;
    	TreeNode root = new TreeNode(pre[pre1]);
    	for(int j=in1;j<=in2;j++){
    		if(pre[pre1]==in[j]){
    			int i= j-in1;
    	    	root.left = help(pre,in,pre1+1,pre1+i,in1,in1+i-1);
    	    	root.right=help(pre,in,pre1+i+1,pre2,in1+i+1,in2);
    		}
    	}
    	return root;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
