class Solution {
    public ArrayList<String> findPermutation(String s) {
        // Code here
        Set<String> result=new HashSet<>();
        boolean[] used=new boolean[s.length()];
        char[] chars=s.toCharArray();
        Arrays.sort(chars);
        backtrack(chars,new StringBuilder(),used,result);
        return new ArrayList<>(result);
        
    }
    private void backtrack(char[] chars,StringBuilder current,
    boolean[] used, Set<String> result){
        if(current.length()==chars.length){
            result.add(current.toString());
            return;
        }
        for(int i=0;i<chars.length;i++){
            if(used[i]){
                continue;
            }
            if(i>0 && chars[i]==chars[i-1] && !used[i-1]){
                continue;
            }
            used[i]=true;
            current.append(chars[i]);
            backtrack(chars,current,used,result);
            
            used[i]=false;
            current.deleteCharAt(current.length()-1);
        }
    }
}
