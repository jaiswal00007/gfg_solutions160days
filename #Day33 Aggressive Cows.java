//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());

        while (tc-- > 0) {

            String[] str = br.readLine().trim().split(" ");
            int[] a = new int[str.length];
            for (int i = 0; i < str.length; i++) {
                a[i] = Integer.parseInt(str[i]);
            }
            String[] nk = br.readLine().trim().split(" ");
            int k = Integer.parseInt(nk[0]);
            Solution sln = new Solution();
            int ans = sln.aggressiveCows(a, k);

            System.out.println(ans);
            System.out.println("~");
        }
    }
}
// } Driver Code Ends


// User function Template for Java
class Solution {
    public static int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int s=1;
        int e=stalls[stalls.length-1]-stalls[0];
        int ans=0;
        while(s<=e){
            int m=(s+e)/2;
            int count=1;
            int last=stalls[0];
            for(int i=1;i<stalls.length;i++){
                if(stalls[i]-last>=m){
                    count++;
                    last=stalls[i];
                }
            }
            if(count>=k){
                ans=m;
                s=m+1;
            }
            else{
                e=m-1;
            }
        }
        return ans;
    }
}
