// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//method to find whether the given array is in permutation or not
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int index = 0;
        int flag = 0 ;
        Arrays.sort(A);
        for(int i=0; i<A.length ; i++)
        {
            index = Arrays.binarySearch(A,i+1);
            if(index == i){ flag = 1;}
            else{ flag = 0;}        
            
        }return flag;
       
    }
}