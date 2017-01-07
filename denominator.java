// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// denominator of the array
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Stack s = new Stack() ;
        int count = 0;
        int leader = 0 ;
        int index = 0;
        for(int i = 0 ;i <A.length ; i++)
        {
            if(s.empty()){s.push(A[i]);}
            else if((int)s.peek() == A[i]){s.push(A[i]);}
            else{s.pop();}
        }
        if(!s.empty()){leader = (int)s.peek();}
        for(int j=0;j<A.length;j++)
        {
            if(leader == A[j]){count = count+1;index = j;}
        }
        if(count > (A.length)/2) { return index ;}
        else{ return -1;}
    }
}