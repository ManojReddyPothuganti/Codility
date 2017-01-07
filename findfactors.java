// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// find factors using O(srt(n))

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        int i =1 ;
        int result = 0;
        while(i*i < N)
        {
            if(N%i == 0)
            {
                result = result + 2;
                
            }
            i++;
            if(i*i == N)
            {
             result= result + 1;   
            }
        }
        return result ;
    }
}