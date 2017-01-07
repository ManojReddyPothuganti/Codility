// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// count the distinct elements in a array
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int size = 0;
        TreeSet ts = new TreeSet();
        for(int i = 0 ; i< A.length ;i++)
        {
            ts.add(A[i]);
        }
        size = ts.size();
        return size ;
    }
}