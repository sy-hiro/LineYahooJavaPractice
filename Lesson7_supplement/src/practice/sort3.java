package practice;

import java.util.Arrays;

public class sort3 {

	public static void main(String[] args) {
		int[] nums = new int[] {4,2,3,5,1};
		int[] nums2 = new int[5];
		for(int i = 0; i < nums.length; i++) {
			nums2[i] = nums[i];
			System.out.println("nums2[i]" + nums2[i]);
			for(int j = i; j>0; j--) {
				System.out.println("nums2[j]" + nums2[j]);
				
				if (nums2[j-1] > nums2[j]) {
					int temp = nums2[j-1];
					nums2[j-1] = nums2[j];
					nums2[j] = temp;
					System.out.println(Arrays.toString(nums2));
				}
			}
		}
//		System.out.println(Arrays.toString(nums2));
	}
}
