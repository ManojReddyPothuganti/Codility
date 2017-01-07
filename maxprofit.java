// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//max profit of the stock
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        
        int maxprofit = 0;
        int result =0;
        if(A.length == 1 || A.length == 0){return 0 ;}
        int minbuy = A[0];
        for(int i=1;i<A.length;i++)
        {
            maxprofit = Math.max(0,A[i]-minbuy);
            
            minbuy = Math.min(minbuy,A[i]);
            
            result = Math.max(result,maxprofit);
                   }
        return result ;
    }
}