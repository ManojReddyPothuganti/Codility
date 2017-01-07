// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//edges form the triangle
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int sum = 0;
        int flag =0;
        int n = A.length ;
        if(n<3){return 0 ;}
        for(int i=0;i<n-2;i++)
        {
         if(A[i] + A[i+1] > A[i+2]){return 1;}
         
        }
     return 0;    
    }
}