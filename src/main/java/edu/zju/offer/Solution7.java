package edu.zju.offer;

public class Solution7 {
	/*
	int[] sum = new int[40];
    public int Fibonacci(int n) {

    	for(int i=0;i<40;i++)sum[i]=-1;
    	sum[0]=0;
    	sum[1]=1;
    	if(n==0)return sum[0];
    	if(n==1)return sum[1];
    	return help(n);
    }
    int help(int n){
    	int n1,n2;
    	if(sum[n-1]!=-1){
    		n1=sum[n-1];
    	}else{
    		n1=help(n-1);
    		sum[n-1]=n1;
    	}
    	
    	if(sum[n-2]!=-1){
    		n2=sum[n-2];
    	}
    	else{
    		n2=help(n-2);
    		sum[n-2]=n2;
    	}
    	return n1+n2;
    }
    */
    
    public int Fibonacci(int n) {
    	int pre1=1,pre2=0;
    	while(n!=-1){
    		n--;
    		pre1 = pre1 +pre2;
    		pre2 =pre1 -pre2;
    	}
    	return pre2;
    }
}
