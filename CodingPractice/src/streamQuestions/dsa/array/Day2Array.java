package streamQuestions.dsa.array;

import java.util.Arrays;

public class Day2Array {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        reverseArray(arr);
        System.out.println("reversed : " + Arrays.toString(arr));
        int[] arr1 = {0, 1, 0, 12, 0, 3, 4, 5};
        moveZero(arr1);
        System.out.println("moveZero  : " + Arrays.toString(arr1));
        /*remove duplicates hw*/
        /*duplicate zero hw*/
        /*do 2 -3 questions of array rotation*/

    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1, temp = 0;
        while (left < right) {
            temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }

    public static void moveZero(int[] arr) {
        int w = 0;
        for (int data : arr) {
            if (data != 0) {
                arr[w] = data;
                w++;
            }
        }
        while (w < arr.length) {
            arr[w] = 0;
            w++;
        }
    }
}
