//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        while (tc-- > 0) {
            String[] inputLine = br.readLine().split(" ");
            int n = inputLine.length;
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }
            System.out.println(new Solution().maxProduct(arr));
        }
    }
}

// } Driver Code Ends


class Solution {
    // Function to find maximum product subarray
    int maxProduct(int[] arr) {
        // code here
        int mx=arr[0];
        int scmx=arr[0];
        int end=arr[0];
        for(int i=1;i<arr.length;i++){
            int temp=scmx;
            scmx=Math.max(arr[i],Math.max(arr[i]*scmx,arr[i]*end));
            end=Math.min(arr[i],Math.min(arr[i]*temp,arr[i]*end));
            mx= Math.max(scmx,mx);
        }
        return mx;
    }
}
