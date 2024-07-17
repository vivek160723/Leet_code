class Solution {
    public boolean isIsomorphic(String s, String t) {
        if (s.length()!=t.length()){
            return false;
        }
        int [] arr1=new int[256];
        int [] arr2=new int[256];


        for(int i=0;i<s.length();i++){
            char sChar = s.charAt(i);
            char tChar = t.charAt(i);

            if(arr1[sChar]!=arr2[tChar]){
                return false;
            }

            arr1[sChar]=i+1;
            arr2[tChar]=i+1;

        }
        return true;
    }
}
