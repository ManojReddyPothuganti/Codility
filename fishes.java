// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// nnumber of fishes alive
import java.util.*;
class Solution {
    public int solution(int[] A, int[] B) {
        // write your code in Java SE 8
        Stack s = new Stack();
        int size =0;
        int dir = 0;
        for(int i=0;i<A.length;i++)
        {
            size = A[i];
            dir = B[i];
            if(s.empty())
            {
                s.push(i);
            }
            else
            {
                while(!s.empty() && dir-B[(int)s.peek()] == -1 &&A[(int)s.peek()]<size)
                {
                    s.pop();
                }
                if(!s.empty())
                {
                    if(dir-B[(int)s.peek()]!= -1){s.push(i);}
                }
                else{ s.push(i);}
            }
        }
        return s.size();
    }
}