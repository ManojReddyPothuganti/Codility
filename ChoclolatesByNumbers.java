// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//ChoclatesByNumbers
class Solution {
    public int solution(int N, int M) {
        // write your code in Java SE 8
        int result = N/gcd(N,M);
        return result;
        
    }
    public int gcd(int a,int b)
    {
        if(b==0)return a;
        else return gcd(b,a%b);
    }
}