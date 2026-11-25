package streamQuestions.dsa.array;

import java.util.Arrays;

public class Day1Array {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 14, 5};
        int arr1[] = new int[5];

        //sum of array
        System.out.println("sum of array : " + sumOfArray(arr));

        System.out.println("find : " + find(arr, 6));

        System.out.println("find max : " + findMax(arr));
        int[] findSmax = findSMax(new int[]{16, 2, 3, 4, 5});
        System.out.println("find second max : " + Arrays.toString(findSmax));

        int[] consOnesArr = {1, 1, 1, 0, 1, 1, 1, 1};
        System.out.println(" consecutive one : " + +consOnes(consOnesArr));

        System.out.println("buy sell stock maximum profit : " + buyAndSellStock(new int[]{7, 1, 5, 3, 6, 4}));
        /*to do home work*/
        /*a.check array is sorted or not
        int[] sortedArray = {1,2,3,4,5,6,8}

        b.find number with even number of digits
        c.maximum difference between increasing element
        d.replace element with greatest element
        e.find thired largest number of array
         * */
//        a.check array is sorted or not
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 9, 8, 8};
        System.out.println("check is array sorted :" + checkIsArraySorted(sortedArray));
//        b.find number with even number of digits
        int[] nums = {12, 345, 2, 61, 7896};
        System.out.println("find number with even number of digits : " + findEvenNumber(nums));
//        c.maximum difference between increasing element
        int[] numsDiff = {7, 1, 5, 4};
        System.out.println(" max diff : "+maximumDifference(numsDiff));
    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }

    public static int find(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int[] findSMax(int[] arr) {
        Integer max = Integer.MIN_VALUE;
        Integer smax = Integer.MIN_VALUE;
        for (Integer data : arr) {
            if (max < data) {
                smax = max;
                max = data;
            } else if (max > data && smax < data) {
                smax = data;
            }
        }
        return new int[]{max, smax};
    }

    public static int consOnes(int[] arr) {
        int c = 0, m = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                c++;
                m = Math.max(c, m);
            } else {
                c = 0;
            }

        }
        return m;
    }

    public static int buyAndSellStock(int[] arr) {
        int minBuyPrice = arr[0], maxProfite = 0;
        for (int i = 1; i < arr.length; i++) {
            maxProfite = Math.max(maxProfite, arr[i] - minBuyPrice);
            minBuyPrice = Math.min(arr[i], minBuyPrice);
        }
        return maxProfite;
    }

    public static boolean checkIsArraySorted(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i - 1] > arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static int findEvenNumber(int[] arr) {
        int evenNumberCount = 0;
        for (int num : arr) {
            long n = Math.abs((long) num);
            int digit = 0;
            if (n == 0) {
                digit = 1;
            } else {
                while (n > 0) {
                    digit++;
                    n = n / 10;
                }
            }
            if (digit % 2 == 0) {
                evenNumberCount++;
            }
        }
        return evenNumberCount;
    }

    public static int maximumDifference(int[] arr) {
        int startNum = arr[0];
        int diff = 0;
        for (int i = 1; i < arr.length; i++) {
            startNum = Math.max(startNum,arr[i]-diff);
            diff = Math.max(diff,arr[i]);
        }
        return diff;
    }
}
