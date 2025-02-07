class SingleNumber {
    public int singleNumber(int[] nums) {
        int xor = 0;
        for (int i = 0; i < nums.length; i++) {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}

// The XOR operator has the following properties:
// a ^ a = 0 (any number XOR-ed with itself is 0
// a ^ 0 = a (any number XOR-ed with 0 remains the same
// XOR is commutative and associative, meaning the order of operations does not
// matter.
