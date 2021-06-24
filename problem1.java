import java.util.*;
class problem1{
  public static void main(String arg[]){
      int n;
      Scanner sc = new Scanner(System.in);
      n = Integer.parseInt(sc.nextLine());
      int arr[] = new int[n];
       for(int i=0;i<n;i++){
         arr[i] = Integer.parseInt(sc.nextLine());
       }
      System.out.print(maxSubArray(arr));
  }

public static int maxSubArray(int[] nums) {
        int size = nums.length;
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
 
        for (int i = 0; i < size; i++)
        {
            max_ending_here = max_ending_here + nums[i];
            if (max_so_far < max_ending_here)
                max_so_far = max_ending_here;
            if (max_ending_here < 0)
                max_ending_here = 0;
        }
        return max_so_far;
    }
}
