class Check {
    /*
     * Given an array nums, return true if the array was originally sorted in
     * non-decreasing order, then rotated some number of positions (including zero).
     * Otherwise, return false.
     */
    public static boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
            if (count > 1)
                return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int nums[] = { 4, 5, 6, 7, 1, 2, 3 };
        System.out.println(check(nums));
    }
}