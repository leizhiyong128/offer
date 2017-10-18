package edu.zju.offer;

public class GetUglyNumber_Solution {
    public int GetUglyNumber_Solution(int index) {
    	if(index==0)return 0;
        int m1=0,m2=0,m3=0;
        int min = 1;
        int dp[] = new int[index];
        dp[0]=1;
        for(int i=1;i<index;i++){
            min = Math.min(dp[m1]*2, Math.min(dp[m2]*3, dp[m3]*5));
            dp[i]=min;
            if(min == dp[m1]*2)m1++;
            if(min == dp[m2]*3)m2++;
            if(min == dp[m3]*5)m3++;
        }
        return dp[index-1];
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
