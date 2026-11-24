package streamQuestions.array;

public class Day1 {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5};
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

        System.out.println("find : "+ find(arr,6));

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
      for (int i = 0; i<arr.length;i++){
          if(arr[i]== target){
              return i;
          }
      }
      return -1;
    }
}
