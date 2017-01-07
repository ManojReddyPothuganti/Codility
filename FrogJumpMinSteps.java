// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

// Frog jump problem to print minimum number of steps required 

class Solution {
    public int solution(int X, int Y, int D) {
        // write your code in Java SE 8
        int diff = 0;
        int result = 0;
        diff = Y - X ;
        int remainder = diff % D ;
        if(remainder > 0){result = (diff/D) + 1 ;}
        else{ result = diff / D ; }
        return result ;
    }
}