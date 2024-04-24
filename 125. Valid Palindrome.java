class Solution {
    public boolean isPalindrome(String s) {
              String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int ptr1 = 0;           // left pointer at the begining 
        int ptr2 = s1.length() - 1;   // right pointer at laast
        while (ptr1 < ptr2) {
            if (s1.charAt(ptr1) != s1.charAt(ptr2)) {
                return false;
            }
            ptr1++;
            ptr2--;
        }
        return true;
    }

    }
