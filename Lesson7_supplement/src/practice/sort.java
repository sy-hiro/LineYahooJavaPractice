package practice;

import java.util.Arrays;

public class sort {

	public static void main(String[] args) {
		int[] nums = new int[] {4,2,3,5,1};
		for(int i = 0; i < nums.length - 1; i++) {
//			System.out.println("nums[i]" + nums[i]);
			for(int j = i+1; j< nums.length; j++) {
//				System.out.println("nums[j]" + nums[j]);
				if (nums[i] > nums[j]) {
					int temp = nums[i];
					nums[i] = nums[j];
					nums[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(nums));
	}
}
