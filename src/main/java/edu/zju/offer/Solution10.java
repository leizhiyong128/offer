package edu.zju.offer;

public class Solution10 {
    public int RectCover(int target) {

        if(target == 0) return 0;
        int pre1 = 1 ,pre2 = 1;
        while(target > 0){
            target--;
            pre1 = pre1 + pre2;
            pre2 = pre1 - pre2;
        }
        return pre2;
    }
}
