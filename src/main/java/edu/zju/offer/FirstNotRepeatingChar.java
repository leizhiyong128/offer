package edu.zju.offer;

public class FirstNotRepeatingChar {
    public int FirstNotRepeatingChar(String str) {
    	char[] chs = str.toCharArray();
    	char[] hash = new char[256];
    	for(char ch : chs){
    		hash[ch]++;
    	}
    	for(int i = 0;i<chs.length;i++){
    		if(hash[chs[i]]==1)return i;
    	}
        return 0;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
