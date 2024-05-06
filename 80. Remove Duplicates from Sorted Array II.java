class Solution {

    public int removeDuplicates(int[] nums) {
        // Base case
        if (nums.length <= 2) {
            return nums.length;
        }

        int index = 2; // Index to place the next unique element
        for (int i = 2; i < nums.length; i++) {
            // If the current element is different from the element two positions back
            if (nums[i] != nums[index - 2]) {
                nums[index++] = nums[i]; // Place the current element at the index position
            }
        }

        return index;
    }

}
