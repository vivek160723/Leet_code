class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String x = strs[0];
        String y = strs[strs.length - 1];
        int idx = 0;
        while (idx < x.length() && idx < y.length()) {
            if (x.charAt(idx) == y.charAt(idx)) {
                idx++;
            }

            else {
                break;
            }
        }
        return x.substring(0, idx);
    }
}
