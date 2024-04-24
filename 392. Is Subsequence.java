class Solution {
    public boolean isSubsequence(String s, String t) {
        int ptrs=0;
        int ptrt=0;

        while( ptrs<s.length() && ptrt<t.length()){
            if(s.charAt(ptrs)==t.charAt(ptrt)){
                ptrs++;
            }
            ptrt++;
        }
        return ptrs == s.length();
    }
}
