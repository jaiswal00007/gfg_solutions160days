//{ Driver Code Starts
import java.io.*;
import java.lang.*;
import java.util.*;

class GFG {

    public static void main(String[] args) throws IOException {

        // taking input using BufferedReader class
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // taking total count of testcases
        int t = Integer.parseInt(br.readLine());
        while (t-- > 0) {
            // Reading the two Strings
            String s1 = br.readLine();
            String s2 = br.readLine();

            // Creating an object of class Rotate
            Solution obj = new Solution();

            // calling areRotations method
            // of class Rotate and printing
            //"1" if it returns true
            // else "0"
            if (obj.areRotations(s1, s2)) {
                System.out.println("true");
            } else {
                System.out.println("false");
            }
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to check if two strings are rotations of each other or not.
    public static boolean areRotations(String s1, String s2) {
        // Your code here
        if(s1.length()!=s2.length()){
            return false;
        }
        String temp=s1+s1;
        return kmp(temp,s2);
    }
    public static int[] callps(String pattern){
        int lps[]= new int[pattern.length()];
        int len=0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                lps[i++]= ++len;
            }
            else{
                if(len!=0){
                    len=lps[len-1];
                }
                else{
                    lps[i++]=0;
                }
            }
        }
        return lps;
    }
    public static boolean kmp(String text, String pattern){
        int lps[]=callps(pattern);
        int i=0,j=0;
        while(i<text.length()){
            if(pattern.charAt(j)==text.charAt(i)){
                i++;
                j++;
                if(j==pattern.length()){
                    return true;
                }
            }
            else{
                if(j!=0){
                    j=lps[j-1];
                    
                }
                else{
                    i++;
                }
            }
        }
        return false;
       
    }
}
