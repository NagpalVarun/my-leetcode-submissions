// This approach is modifying an array

public class Approach_1_Negative_Marking{
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,2};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
        	if(nums[Math.abs(nums[i])]<0) return Math.abs(nums[i]);
        	nums[Math.abs(nums[i])] *= -1;
        }
        return 0;
    }
}