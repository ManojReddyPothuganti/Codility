// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Missing minimum positive integer 
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int first = 0 ;
        int ele = 0 ;
        int mi = 0 ;
        int j=0;
        TreeSet ts = new TreeSet();
        for(int i=0;i<A.length;i++)
        {
            ts.add(A[i]);
        }
        first =(int)ts.first();
        if(A.length == 1){ return first+1 ;}
        Iterator  itr = ts.iterator();
        while (itr.hasNext() &&  j == 0) 
        {
            ele = (int)itr.next();
            if( ele > 0  && first > 0)
            {
                if((ele-first) >1  ){ mi = first + 1;j=1; break;}
                else{ first = ele ;}
                
            }
            first = ele ;
        }    
        return mi ;    
    }
}