
public class RemoveElement {
	public static void main(String args[]) {
		
		int[] elements = new int[] {3,2,2,3};
		
		int len = elements.length;
		
		for(int i = 0; i < len; i++) {
			System.out.println(elements[i]);
		}
		
		int element = 3;
		
		removeElement(elements, element);
	}
	
    public static int removeElement(int[] nums, int val) {
    	
    	for(int i = 0; i <= nums.length;) {
    		if(nums[i] == val) {
    			nums[i] = nums[i + 1];
    			for(int j = 0; j < nums.length; j++) {
    				System.out.println(nums[j]);
    			}
    		}
    		i++;
    	}
        
    	return nums.length;
    }
}
