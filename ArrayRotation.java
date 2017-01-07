// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");
// Methodto rotate Array by K times
class Solution {
    public int[] solution(int[] A, int K) {
        // write your code in Java SE 8
        int[] rotated = new int[A.length];

        for (int i = 0; i < A.length; i++) 
	{
           
	 int newPos = (i + K) % A.length;
  
          rotated[newPos] = A[i];
        
	}

        return rotated;
    }
}