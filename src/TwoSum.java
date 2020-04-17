
public class TwoSum {
	
	public static void main(String args[]) {
		int[] nums = new int[4];
		nums[0] = 2;
		nums[1] = 7;
		nums[2] = 11;
		nums[3] = 15;
		for(int i = 0; i < nums.length; i++) {
			System.out.println(nums[i]);
		}
		
		int number = 9;
		
		twoSum(nums, number);
	}

	public static int[] twoSum(int[] nums, int target) {
		int[] indices = new int[2];
		
		if(nums == null) {
			return indices;
		}

		for(int i = 0; i < nums.length; i++) {
			for(int j = i+1; j <= nums.length - 1; j++) {
				if((nums[i] + nums[j]) == target) {
					indices[0] = i;
					indices[1] = j;
					break;
				}
			}
		}
		
		return indices;
	}
	
	public int[] optimalSolutionTwoSum(int[] nums, int target) {
	    for (int i = 0; i < nums.length; i++) {
	        for (int j = i + 1; j < nums.length; j++) {
	            if (nums[j] == target - nums[i]) {
	                return new int[] { i, j };
	            }
	        }
	    }
	    throw new IllegalArgumentException("No two sum solution");
	}
}
