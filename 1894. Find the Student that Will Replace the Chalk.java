class Solution {
    public int chalkReplacer(int[] chalk, int initialChalkPieces) {
        long totalChalkNeeded = 0;
        for (int i = 0; i < chalk.length; i++) {
            totalChalkNeeded += chalk[i];
        }
        long remainingChalk = initialChalkPieces % totalChalkNeeded;
        for (int i = 0; i < chalk.length; i++) {
            if (remainingChalk < chalk[i]) {
                return i;
            }
            remainingChalk -= chalk[i];
        }
        return 0;
    }
}
