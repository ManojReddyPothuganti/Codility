// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//Missing Permutation in an array
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result= 0;
        Arrays.sort(A);
        if(A.length == 0){ return 1;}
        if(A.length == 1){ if(A[0] == 1 ){return 2;}else {return 1 ; }}
        for(int i=0;i<A.length-1;i++)
        {
          if(A[0]!= 1) { result = 1 ; break;}
          if(A[A.length-1] != A.length + 1) { result = A.length + 1; break;} 
          if((A[i+1] - A[i]) != 1){ result = A[i] + 1 ;}
                
        } return result;
    }
}