package streamQuestions.array;

import java.util.Arrays;

public class Day1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 14, 5};
        int arr1[] = new int[5];

//        for (int data : arr) {
//            System.out.println(data);
//        }
//        for (int data : arr1) {
//            data = 1;
//            System.out.println(data);
//        }
        //sum of array
        System.out.println("sum of array : " + sumOfArray(arr));

        System.out.println("find : " + find(arr, 6));

        System.out.println("find max : " + findMax(arr));
        int[] findSmax = findSMax(new int[]{16,2,3,4,5});
        System.out.println("find second max : " + Arrays.toString(findSmax));

       int[] consOnesArr = {1,1,1,0,1,1,1,1 };
        System.out.println(" consecutive one : "+ +consOnes(consOnesArr));

        System.out.println("buy sell stock maximum profit : "+ buyAndSellStock(new int[]{7,1,5,3,6,4}));

    }

    public static int sumOfArray(int[] arr) {
        int sum = 0;
//        for (int data : arr) {
//            sum = sum + data;
//        }
//        return sum;

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
        return new int[]{max,smax};
    }

    public static int consOnes(int[] arr){
        int c=0,m=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]==1){
                c++;
                m= Math.max(c,m);
            }else {
                c=0;
            }

        }
        return m;
    }
    public static int buyAndSellStock(int[] arr){
        int minBuyPrice=arr[0],maxProfite = 0;
        for (int i=1;i<arr.length;i++){
            maxProfite = Math.max(maxProfite,arr[i]-minBuyPrice);
            minBuyPrice = Math.min(arr[i],minBuyPrice);
        }
        return maxProfite;
    }
}
