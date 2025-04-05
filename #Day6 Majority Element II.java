//{ Driver Code Starts
import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        while (t-- > 0) {
            String s = sc.nextLine();
            String[] parts = s.split(" ");
            int[] nums = new int[parts.length];
            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }
            Solution ob = new Solution();
            List<Integer> ans = ob.findMajority(nums);

            if (ans.size() == 0) {
                System.out.println("[]");
            } else {
                for (int i : ans) {
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
        sc.close();
    }
}

// } Driver Code Ends


class Solution {

    // Function to find the majority elements in the array
    public List<Integer> findMajority(int[] nums) {
        // Your code goes here.
        ArrayList<Integer> l = new ArrayList<Integer>();
        int track1=0;
        int track2=0;
        int count1=0; 
        int count2=0;
        int n= nums.length;
        for(int i=0;i<n;i++){
            if(nums[i]==track1){
                count1++;
            }
            else if(nums[i]==track2){
                count2++;
            }
            else if(count1==0){
                track1=nums[i];
                count1=1;
            }
            else if(count2==0){
                track2=nums[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        // second verification
        for(int j=0;j<n;j++){
            if(nums[j]==track1){
                count1++;
            }
            else if(nums[j]==track2 ){
                count2++;
            }
        }
        if(count1>n/3){
            l.add(track1);
        }
        if(count2>n/3){
            l.add(track2);
        }
        Collections.sort(l);
        return l;
    }
}
