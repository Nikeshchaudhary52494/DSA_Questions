class MoveZeroes {
    public static int[] moveZeroes(int[] nums) {
        int n = nums.length;
        int res[] = new int[n];

        int index = 0;
        for (int num : nums) {
            if (num != 0) {
                res[index++] = num;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 4, 0, 6, 2, 8, 0, 3, 0, 1, 0, 0, 0, 6 };
        nums = moveZeroes(nums);
        for (int num : nums) {
            System.out.println(num);
        }
    }
}