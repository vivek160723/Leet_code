class Solution {
    public int[] twoSum(int[] nums, int target) {
        int left=0;
        int right=nums.length-1;
        while(nums[left]+nums[right]!=target){
            if(nums[left]+nums[right]<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{left+1,right+1};
    }
}
