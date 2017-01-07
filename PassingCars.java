// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Count the number of passing cars

class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int sumleft = 0;
        int sumright = 0;
        int sumtotal = 0;
        long result = 0;
        for(int i= 0 ; i<A.length ; i++)
        {
            sumtotal = sumtotal + A[i] ;
        }
        for(int j= 0; j<A.length ; j++)
        {
            sumleft = sumleft + A[j];
            if(A[j] == 0)
            {
                sumright = sumtotal -sumleft ;
                if(result < 1000000000)
                {
                    result = result + sumright ; 
                }
                else{ return -1 ;}
            }
        }
        return (int)result ;
    }
}