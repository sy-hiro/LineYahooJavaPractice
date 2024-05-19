package practice;

import java.util.Arrays;

public class sort2 {

	public static void main(String[] args) {
		int[] nums = new int[] {4,2,3,5,1};
		for(int i = 0; i <= nums.length-1; i++) {
			System.out.println("nums[i]" + nums[i]);
			for(int j = nums.length-1; j > i; j--) {
				System.out.println("nums[j]" + nums[j]);
				if (nums[j - 1] > nums[j]) {
					int temp = nums[j - 1];
					nums[j - 1] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
