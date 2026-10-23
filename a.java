import java.util.*;
class Solution {
    public boolean isPalindrome(int x) {
     Scanner scn = new Scanner(System.in);
     int rev=0;
      while(x>0){
        int a = x%10;
        rev=rev*10+a;
        x=x/10;
      } 
      if(x==rev){
        System.out.print("true");
      }
      else{
        System.out.print("false");
      }
    }
} 
    
