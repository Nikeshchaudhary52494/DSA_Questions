class PowerSet {
    public List<List<Integer>> subsets(int[] nums) {
        int n = nums.length; 
        int subsetCount = 1 << n; // Total number of subsets = 2^n
        List<List<Integer>> res = new ArrayList<>();

        for (int i = 0; i < subsetCount; i++) { // Iterate through all possible subsets
            List<Integer> sub = new ArrayList<>();
            for (int j = 0; j < n; j++) { 
                if ((i & (1 << j)) != 0) { // Check if the j-th bit of i is set
                    sub.add(nums[j]);
                }
            }
            res.add(sub);
        }
        return res;
    }
}
