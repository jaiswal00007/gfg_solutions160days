//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String a, b;
            a = sc.next();
            b = sc.next();
            Solution ob = new Solution();
            System.out.println(ob.addBinary(a, b));

            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution {
    public String addBinary(String s1, String s2) {
        // code here
        var res=new StringBuilder();
        int i=s1.length()-1;
        int j=s2.length()-1;
        int carry=0;
        while(i>=0 || j>=0 || carry>0){
            int bit1= (i>=0)? s1.charAt(i)-'0':0;
            int bit2= (j>=0)? s2.charAt(j)-'0':0;
            i--;
            j--;
            int total=bit1+bit2+carry;
            res.append(total%2);
            carry=total/2;
        }
        
        res.reverse();
        // removing leading zeros from output
        while(res.length()>1 && res.charAt(0)=='0'){
            res.deleteCharAt(0);
        }
        return res.toString();
    }
   
    
}
