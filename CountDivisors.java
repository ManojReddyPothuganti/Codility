// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//count number of divisors between the range 
class Solution {
    public int solution(int A, int B, int K) {
        // write your code in Java SE 8
       int result =  A > 0 ? (B / K - ((A - 1) / K)) : ((B / K) + 1);
       return result;
    }
}