// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sumleft = 0;
        int sumright = 0 ;
        int difference = 0 ;
        int sumtotal = 0;
        int mindiff = 0 ;
        int[] b = new int[A.length];
        for(int i=0;i<A.length;i++)
        {
            sumtotal = sumtotal + A[i] ;
        }
        mindiff = sumtotal ;
        for(int j=0;j<A.length;j++)
        {
            sumleft = sumleft+A[j];//System.out.println(sumleft);
            sumright = sumtotal - sumleft;
            if(sumleft > sumright){ difference = sumleft - sumright ;}

            if(sumright > sumleft){ difference = sumright - sumleft ;}

	    if(sumright==sumleft){ difference = 0;}            
            if(mindiff > difference)
            {
                mindiff = difference ;
            }
          
         } return mindiff  ;
        
    }
}