// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//find minimum perimeter of the rectangle

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i = 1;
        int length =0;
        int breadth = 0;
        int result = 2 *(1 + N);
        int perimeter = 0;
        while(i < Math.sqrt(N))
        {
            if(N%i == 0)
            {
                length = i;
                breadth = N/i;
                perimeter = 2 *(length + breadth);
                
            }
            i++;
            if( i * i == N)
            {
                perimeter = 2 * (i+i);
            }
            if(result > perimeter)
            {
                result = perimeter;
            }
            
        }
        return result ;
    }
}