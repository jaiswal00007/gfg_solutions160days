//{ Driver Code Starts
import java.io.*;
import java.util.*;

class Sorting {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int g = 0; g < t; g++) {
            String[] str = (br.readLine()).trim().split(" ");
            int arr[] = new int[str.length];
            for (int i = 0; i < str.length; i++) arr[i] = Integer.parseInt(str[i]);
            System.out.println(new Solution().circularSubarraySum(arr));
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


class Solution {

    // a: input array
    // n: size of array
    // Function to find maximum circular subarray sum.
    public int circularSubarraySum(int arr[]) {
            
        // Your code here
        int a1=0;
        int b1=arr[0];
        int c1=0;
        int d1=arr[0];
        int total=0;
        for(int i:arr){
            total+=i;
            a1=i+Math.max(a1,0);
            b1=Math.max(b1,a1);
            c1=i+Math.min(c1,0);
            d1= Math.min(d1,c1);
        }
        if(b1>0){
            return Math.max(b1,total-d1);
        }
        else{
            return b1;
        }
    }
}
