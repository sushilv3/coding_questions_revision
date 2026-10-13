import java.util.HashSet;
import java.util.Set;

public class SlidingWindow {
    public static int maxSumSubarray(int[] nums, int k) {

        if (k <= 0 || k > nums.length) {
            throw new IllegalArgumentException("invalid k ");
        }
        int left = 0, right = k - 1;
        int windowSum = 0;
        for (int i = 0; i <= right; i++) {
            windowSum += nums[i];
        }
        int maxSum = windowSum;

        while (right < nums.length - 1) {
            left++;
            right++;
            windowSum = windowSum - nums[left - 1] + nums[right];
            if (windowSum > maxSum) {
                maxSum = windowSum;
            }
        }
        return maxSum;
    }

    public static int lengthOfLongestSubString(String s) {
        Set<Character> set = new HashSet<>();
        int left = 0, maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            char current = s.charAt(right);
            while (set.contains(current)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(current);
            int windowLength = right - left + 1;
            maxLength = Math.max(maxLength, windowLength);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        int[] nums = {4, 2, 1, 7, 8, 1, 2};
        int k = 2;
        int result = maxSumSubarray(nums, k);
        System.out.println("max : " + result);
        System.out.println("====non repeating longest sub string=====");
        System.out.println("lengthOfLongestSubString : " + lengthOfLongestSubString("abcabcbb"));
//        Minimum Size Subarray Sum
//        Permutation in String
//        Longest Repeating Character Replacement
    }
}
