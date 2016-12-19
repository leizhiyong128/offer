package edu.zju.other;

public class sumMax {
	public int getMax(int[] data,int length){
		int num1 = data[0];
		int num2 = data[1];
		int num3 = num1>num2 ? num1:num2;
		
		for(int i = 2;i<length;i++){
			if(num1<0){
				num3 = data[i]>num2 ? data[i]:num2;
			}else{
				num3 = (num1+data[i])>num2 ? (num1+data[i]):num2;
			}
			num1 = num2;
			num2 = num3;
		}
		return num3;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
