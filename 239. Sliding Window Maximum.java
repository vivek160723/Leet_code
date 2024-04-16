class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if(nums==null||nums.length==0||k<=0) return new int[0];

        int n=nums.length;
        int[] result=new int[n-k+1];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++){
            while(!dq.isEmpty()&&dq.peek()<i-k+1){
                dq.poll();
            }

            while(!dq.isEmpty()&&nums[i]>=nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offer(i);
    if(i-k+1>=0){
        result[i-k+1]=nums[dq.peek()];
    }
    }
    return result;
}
}
