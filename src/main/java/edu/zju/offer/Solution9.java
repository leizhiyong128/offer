package edu.zju.offer;

public class Solution9 {
    public int JumpFloorII(int target) {
        return 1<<target-1;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution9 demo = new Solution9();
		System.out.println(demo.JumpFloorII(0));
	}

}
