package edu.zju.offer;

public class Find1 {
    public boolean Find(int target, int [][] array) {
        if(array==null || array.length==0 || array[0].length==0)return false;
        int length = array.length;
        int row = 0;
        int col = length-1;
        while(row < length && col >= 0){
            if(array[row][col] == target)return true;
            else if(array[row][col] <target)row++;
            else col--;
        }
        return false;
    }
}
