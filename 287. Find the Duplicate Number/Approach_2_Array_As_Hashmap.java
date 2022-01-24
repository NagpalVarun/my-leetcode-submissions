public class Approach_2_Array_As_Hashmap{
	public static void main(String[] args) {
		int[] nums = {1,3,4,2,3};
		System.out.println(findDuplicate(nums));
	}

	public static int findDuplicate(int[] nums) {
        for(int i=0;i<nums.length;i++){
        	int numZero = nums[0];

        	if(nums[numZero]==numZero){
        		return numZero;
        	}

        	nums[0] = nums[numZero];
        	nums[numZero] = numZero;
        }
        return 0;
    }
}