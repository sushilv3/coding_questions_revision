package streamQuestions.dsa.array;

import java.util.*;

public class Day3Array {
    public static void main(String[] args) {
        /*hashing and frequency */
        int[] arr = {1, 2, 3, 4, 4};
        System.out.println("check if duplicate present : " + checkDuplicate(arr));

        System.out.println("check if duplicate present TwoPointer : " + checkDuplicateTwoPointer(arr));
        int[] twoSumArr = {2, 7, 11, 15};
        int target = 26;
        System.out.println("two sum using Map : " +
                Arrays.toString(twoSum(twoSumArr, target)));
        int[] duplicateZero = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZero(duplicateZero);
        System.out.println("duplicate zero : " + Arrays.toString(duplicateZero));
//        duplicateZeroOptimize(duplicateZero)
//        System.out.println("duplicate zero optimize: " + Arrays.toString(duplicateZero));
    }

    public static boolean checkDuplicate(int[] arr) {
        Set<Integer> intSet = new HashSet<>();
        for (int data : arr) {
            if (!intSet.add(data)) return true;
        }
        return false;
    }

    public static boolean checkDuplicateTwoPointer(int[] arr) {
        int start = 0, end = arr.length - 1;
        while (start < end) {
            if (start == end) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static int[] twoSum(int[] arr, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int diff = target - arr[i];
            if (map.containsKey(diff)) {
                return new int[]{map.get(diff), i};
            }
            map.put(arr[i], i);
        }
        return new int[0];
    }

    public static void duplicateZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    arr[j] = arr[j - 1];
                }
                i++;//why ignore nested zero
            }
        }
    }

//    public static void duplicateZeroOptimize(int[] arr) {
//    }
}

