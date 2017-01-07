// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

//nested brackets 
import java.util.*;
class Solution {
    public int solution(String S) {
        // write your code in Java SE 8
         LinkedList<Character> stack = new LinkedList<Character>();
         
         for(int i=0;i<S.length();i++) {
             char c = S.charAt(i);
             
             if(c == '{' || c == '[' || c == '(') {
                 stack.push(c);
             } 
                          
                 else if(c == '}' || c == ']' || c == ')' ) {
                 if(stack.isEmpty()) {
                     return 0;
                 }
                 
                 char corresponding = stack.pop();
                 
                 if(c == ')' && corresponding != '(') {
                     return 0;
                 }
                 
                 if(c == ']' && corresponding != '[') {
                     return 0;
                 }
 
                 if(c == '}' && corresponding != '{') {
                     return 0;
                 }
 
             }
             else{ continue ;}
         }
         
         return stack.isEmpty() ? 1 : 0;
    }
}