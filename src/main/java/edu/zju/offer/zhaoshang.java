package edu.zju.offer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class zhaoshang {
	static ArrayList<String> res = new ArrayList<String>();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int m = in.nextInt();
		int n = in.nextInt();
		String sss =in.nextLine();
		HashMap<String,String> map = new HashMap<String, String>();
		String s ="";
		String[] chs;
		for(int i =0;i<m;i++){
			String str = in.nextLine();
			if(i==0)s = str;
			String[] chss = str.split(" ");
			map.put(chss[0], chss[1]+" "+chss[2]);
		}
		
		chs = s.split(" ");
		TreeNode node = new TreeNode(chs[0]);
		TreeNode cur;
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		queue.add(node);
		while(!queue.isEmpty()){
			cur = queue.poll();
			String temp = map.get(cur.val);
			if(temp == null)continue;
			chs = temp.split(" ");
			if(!chs[0].equals("*")){
				cur.left = new TreeNode(chs[0]);
				queue.add(cur.left);
			}
			
			if(!chs[1].equals("*")){
				cur.right = new TreeNode(chs[1]);
				queue.add(cur.right);
			}
		}

		getChild(node, n);
		String ss = "";
		for(String st : res){
			ss = st+" "+ss;
		}
		System.out.println(ss.trim());
	}
	static int getChild(TreeNode root,int n){
		if(root == null)return 0;
		int num = getChild(root.left,n)+getChild(root.right,n);
		if(num>=n)res.add(root.val);
		return num+1;
	}

}
