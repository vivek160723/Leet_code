=========x====x===x====x===x===x===x===x========
                    Method 1:
=========x====x===x====x===x===x===x===x========
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m;
        for (int j = 0; j < n; j++) {
            nums1[i++] = nums2[j];
        }
        Arrays.sort(nums1);
    }
}



=========x====x===x====x===x===x===x===x========
                    Method 2:
=========x====x===x====x===x===x===x===x========
  
  class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=m+n-1; // total length

        while(j>=0){
            if(i>=0 && nums1[i]> nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
}
  
