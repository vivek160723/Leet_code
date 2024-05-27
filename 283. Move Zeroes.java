//bs swap krna hn numbers ko and j is a pointer 

class Solution {
    public void moveZeroes(int[] nums) {
        int j=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
            if(i!=j){
                int temp=nums[j];
                nums[j]=nums[i];
                nums[i]=temp;
            }
            j++;
        }
    }
}
}
