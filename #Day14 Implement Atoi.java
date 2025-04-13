//{ Driver Code Starts
// Initial template for JAVA

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while (t > 0) {
            String str = sc.nextLine();

            Solution obj = new Solution();
            int num = obj.myAtoi(str);
            System.out.println(num);
            System.out.println("~");
            t--;
        }
    }
}
// } Driver Code Ends


class Solution {
    public int myAtoi(String s) {
        // Your code here
        int sign=1;
        int k=0;
        int i=0;
        int n=s.length();
        // eliminating leading whitespaces first
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        // chk for sign 
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign= (s.charAt(i) == '-')? -1:1;
            i++;
        }
        // chk if it exceeds Integer.MAX_VALUE or within Integer.MIN_VALUE
        while(i<n && Character.isDigit(s.charAt(i))){ // Chatacter check
            int digit= s.charAt(i) - '0';
            if(k>(Integer.MAX_VALUE-digit)/10){
                return (sign==1)? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            k=k*10+digit;
            i++;
        }
        return k*sign;
    }
}   
