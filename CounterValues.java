// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Value of counters
class Solution {
    public int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int lastmax = 0;
        int max = 0;
        int x= 0;
        int[] B = new int[N];
        for(int i=0 ; i<A.length;i++)
        {
            x = A[i] - 1;
            if(A[i] <= N)
            {
                if(B[x] < lastmax) B[x] = lastmax ;
                B[x]++;
                if(max < B[x]) max = B[x];
            }
            else
            {
                lastmax = max;
            }
            
        }
        for(int j= 0 ; j<B.length ;j++)
        {
            if(B[j] < lastmax) B[j] = lastmax;
        }
        return B;
    }
}