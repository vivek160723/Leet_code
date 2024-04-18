class Solution {
    public int maximumWealth(int[][] accounts) {
        int wealth = 0;
        for (int[] customer : accounts) {
            int customerWealth = 0;
            for (int account : customer) {
                customerWealth += account;
            }
            wealth = Math.max(wealth, customerWealth);
        }
        return wealth;
    }
}
