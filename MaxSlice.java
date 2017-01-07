// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// to get max sum of a slice in array
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int maxend = A[0];
        int maxslice = maxend;
        for(int i = 1 ;i<A.length;i++)
        {
            maxend = Math.max(A[i],maxend+A[i]);
            maxslice = Math.max(maxslice,maxend) ;
        }
        return maxslice;
    }
}