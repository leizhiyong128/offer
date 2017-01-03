package edu.zju.offer;

public class Solution11 {
    public int NumberOf(String n) {

    	int sum = 0;
    	for(int i=0;i<n.length();i++){
    		char ch = n.charAt(i);
    		sum = sum * 26 +ch -'A'+1;
    	}
    	return sum;
    }
    public int NumberOf1(int n) {

        int flag = 1;
        int sum =0;
        while(flag!=0){
            if((n&flag) !=0){
                sum++;
            }
            flag = flag<<1;
        }
        return sum;
    }
    
    public int NumberOf2(int n){
    	int sum =0;
    	while(n!=0){
    		sum++;
    		n=n&(n-1);
    	}
    	return sum;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution11 demo = new Solution11();
		System.out.println(demo.NumberOf2(10));
	}
}
