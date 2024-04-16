class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map=new HashMap<>();
        int n=nums.length;
        for(int i=0;i<n;i++){
            int req_num=target-nums[i];
            if(map.containsKey(req_num)){
                int ans[]={map.get(req_num),i};
                return ans;
            }
            map.put(nums[i],i);
        }
        return null;
    }
}
