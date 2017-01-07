// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
//maximum product of the triplet in an Array
import java.util.*;
class Solution {
    public int solution(int[] A) {
        // write your code in Java SE 8
        Arrays.sort(A);
        int length = A.length;
        int maxProduct = A[length-1]*A[length-2]*A[length-3];
        int product = A[0]*A[1]*A[length-1];
        if(maxProduct > product)
        {
            return maxProduct;
        }
        else
        {
            return product;
        }
    }
}