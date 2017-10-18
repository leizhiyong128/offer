package edu.zju.offer;

public class ReverseSentence {
    public String ReverseSentence(String str) {
        String[] strs = str.split(" ");
        String res ="";
        for(int i = strs.length-1;i>=0;i--){
            res = res+Reverse(strs[i])+" ";
        }
        return res.trim();
    }
	static String Reverse(String str){
		char[] chs = str.toCharArray();
		int length = chs.length;
		for(int i=0;i<length/2;i++){
			char ch = chs[length-1-i];
			chs[length-1-i]=chs[i];
			chs[i]=ch;
		}
		return String.copyValueOf(chs);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Reverse("a"));
	}

}
