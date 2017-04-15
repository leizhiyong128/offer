package edu.zju.offer;

public class Solution13 {
	public void reOrderArray(int[] array) {
		int[] temp = new int[array.length];
		int num = 0;
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 1) {
				temp[num] = array[i];
				num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			if ((array[i] & 1) == 0) {
				temp[num] = array[i];
				num++;
			}
		}
		for (int i = 0; i < array.length; i++) {
			array[i] = temp[i];
		}
	}

	public void reOrder(int[] array) {
		int pre = 0, aft = array.length - 1;
		while (pre < aft) {
			if ((array[pre] & 1) == 0 && (array[aft] & 1) == 1) {
				int temp = array[pre];
				array[pre] = array[aft];
				array[aft] = temp;
			}
			if ((array[aft] & 1) == 0)
				aft--;
			if ((array[pre] & 1) == 1)
				pre++;
		}
	}

	public static void main(String args[]) {
		Solution13 demo = new Solution13();

		int[] array = {1,2,3,4,5};
		demo.reOrder(array);
		for(int temp :array){
			System.out.println(temp);
		}
	}
}
