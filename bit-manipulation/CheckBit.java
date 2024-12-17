class CheckBit {
    static boolean checkKthBit(int n, int k) {
        return (n & (1 << k)) != 0;
    }

    public static void main(String[] args) {
        int n = 5; // Binary: 0101
        int k = 0; // Checking the 0th bit (rightmost)
        System.out.println(checkKthBit(n, k)); // Output: true
        
        k = 1; // Checking the 1st bit
        System.out.println(checkKthBit(n, k)); // Output: false
        
        k = 2; // Checking the 2nd bit
        System.out.println(checkKthBit(n, k)); // Output: true
    }
}
