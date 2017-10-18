package edu.zju.offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrintMinNumber {

    public String PrintMinNumber(int [] numbers) {

    	ArrayList<String> list = new ArrayList<String>();
    	for(int t : numbers){
    		list.add(String.valueOf(t));
    	}
    	Collections.sort(list,new Comparator<String>() {

			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				String s1 = o1+o2;
				String s2 = o2+o1;
				return s1.compareTo(s2);
			}
		});
    	StringBuilder res =new StringBuilder();
    	for(String s : list){
    		res.append(s);
    	}
    	return res.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
