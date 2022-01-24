public class Approach_3_Floyd_Algo{
	public static void main(String[] args) {
		int[] nums = {2,6,4,1,3,5,5};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
		int slow = nums[0];
		int fast = nums[0];

		do{
			slow = nums[slow];
			fast = nums[nums[fast]];
		}
		while(slow!=fast);

		slow = nums[0];
		while(slow!=fast){
			slow=nums[slow];
			fast=nums[fast];
		}

		return fast;
    }
}