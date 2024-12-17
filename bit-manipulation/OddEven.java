class oddEven {
    static String oddEven(int n) {
        if ((n & 1) == 0) {
            return "even";
        }
        return "odd";
    }

    public static void main(String[] args) {
        System.out.println(oddEven(4)); // Output: even
        System.out.println(oddEven(7)); // Output: odd
        System.out.println(oddEven(0)); // Output: even
    }
}

// Even numbers have their least significant bit (LSB) as 0.
// Odd numbers have their least significant bit (LSB) as 1.