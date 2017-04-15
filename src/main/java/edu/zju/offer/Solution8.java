package edu.zju.offer;

public class Solution8 {
    public int JumpFloor(int target) {
        if(target == 0) return 0;
        if(target ==1) return 1;
        if(target ==2) return 2;
        return JumpFloor(target-1)+JumpFloor(target-2);
    }
    
    public int JumpFloor1(int target) {
    	if(target == 0) return 0;
        if(target ==1) return 1;
        if(target ==2) return 2;
        int pre1=2,pre2=1;
        
        while(target !=2){
        	target--;
        	pre1 = pre1 +pre2;
        	pre2 = pre1-pre2;
        }
        return pre1;
    }
}
