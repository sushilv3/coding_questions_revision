import java.util.Arrays;
import java.util.Scanner;

public class TwoPointer {
    public static int[] twoSum(int[] nums, int target) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            int sum = nums[left] + nums[right];
            if(sum==target){
                System.out.println("left : "+left +" right : "+right);
                System.out.println("left value : "+nums[left] +" right value : "+nums[right]);
                return new int[]{left+1,right +1};
            }else if(sum<target){
                left++;
            }else{
                right--;
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Array Size: ");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter sorted array elements : ");
        for (int i=0; i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println("enter target : ");
        Scanner target = new Scanner(System.in);

       int[] result= twoSum(nums,target.nextInt());
       if(result[0]==-1){
           System.out.println("no pair found");
       }else {
           System.out.println("pair : "+ Arrays.toString(result));
       }
    }

}
