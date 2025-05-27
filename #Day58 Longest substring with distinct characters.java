// User function Template for Java

class Solution {
    public int longestUniqueSubstr(String s) {
        // code here
        int n=s.length();
        int max=0;
        int start=0;
        HashSet<Character> set = new HashSet<>();
        for(int i=0;i<n;i++){
            char ch= s.charAt(i);
            
        while(set.contains(ch)){
            set.remove(s.charAt(start));
            start++;
        }
        set.add(ch);
        max= Math.max(max,i-start+1);
        }
        return max;
    }
}
