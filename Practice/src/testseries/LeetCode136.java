package testseries;

public class LeetCode136 {
	public static void main(String[] args) {
		int nums[] = { 1, 5, 6, 5, 7, 7, 2, 1, 3, 2, 8, 8 };
		for (int i = 0; i < nums.length; i++) {
			int count = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] == nums[j]) {
					count++;
					break;
				}
			}
			if (count == 0) {
				System.out.println(nums[i]);
			}
		}
	}
}
