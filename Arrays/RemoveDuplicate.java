import java.util.LinkedHashSet;

// leetcode:26

/*
 * Given an integer array nums sorted in non-decreasing order, remove the duplicates in-place such that each unique element 
 * appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in nums.
 */
class RemoveDuplicates {
    public int removeDuplicates1(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }

    public int removeDuplicates2(int[] nums) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int value : nums) {
            set.add(value);
        }

        int index = 0;
        for (int value : set) {
            nums[index++] = value;
        }

        return set.size();
    }
}