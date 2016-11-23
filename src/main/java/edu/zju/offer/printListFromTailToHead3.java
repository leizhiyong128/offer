package edu.zju.offer;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
    this.val = val;
    }
}
/*
 * 反转链表
 */
public class printListFromTailToHead3 {
	//使用递归
	/*
	public ArrayList<Integer> list = new ArrayList<Integer>();
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	if(listNode == null )return list;
        help(listNode);
        return list;
    }
    public void help(ListNode listNode){
    	if(listNode.next!=null)help(listNode.next);
    	list.add(listNode.val);
    }
    */
	
	//使用栈
	/*
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(listNode == null )return list;
    	Stack<Integer> stack = new Stack<Integer>();
    	stack.push(listNode.val);
    	while(listNode.next!=null){
    		listNode = listNode.next;
    		stack.push(listNode.val);
    		
    	}
    	while(!stack.isEmpty()){
    		list.add(stack.pop());
    	}
        return list;
    }
    */
	
	
	//反转链表
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(listNode == null )return list;
    	ListNode head = listNode;
    	ListNode pre = null;
    	while(listNode.next!=null){
    		ListNode temp = listNode.next;
    		listNode.next = pre;
    		pre = listNode;
    		listNode = temp;
    	}
    	listNode.next = pre;
    	
    	while(listNode!=null)
    	{
    		list.add(listNode.val);
    		listNode = listNode.next;
    	}
    	return list;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListNode head = new ListNode(1);
		ListNode node = new ListNode(2);
		head.next = node;
		node.next=null;

		printListFromTailToHead3 demo = new printListFromTailToHead3();
		ArrayList<Integer> list =demo.printListFromTailToHead(head);
		for(int temp : list){
			System.out.println(temp);
		}
	}
}
