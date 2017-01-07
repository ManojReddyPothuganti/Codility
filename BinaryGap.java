// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Solution {
    public int solution(int N) {
        // write your code in Java SE 8
        System.out.println("Given (input): "+N);
  // Test is input valid?

  String binaryEquiv = Integer.toBinaryString(N);
  System.out.println("Binary Equiv.: "+binaryEquiv);
  

  StringBuilder sb = new StringBuilder(binaryEquiv);
  if ( sb.length() <= 2)
   return -1;
  char nbr_zero  = '0';
  char nbr_one   = '1'; 
  int largestGap = 0;
  int counter = 0;
  for (int i = 0; i<sb.length()-1; i++){
    if ( sb.charAt(i) == nbr_one && sb.charAt(i+1) == nbr_zero){
        if (counter > largestGap)
            largestGap = counter;
        counter = 0;
    } else if ( sb.charAt(i) == nbr_zero){  
        counter++;
    }
  }
  if (largestGap < counter) {return counter;}
  else {return largestGap;}
 }
}
class TestSolution
{
    public static void main(String args[])
    {
        int n = 1041 ;
        Solution s = new Solution();
        System.out.println(s.solution(n));
    }
}    