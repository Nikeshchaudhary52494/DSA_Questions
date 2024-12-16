public class SwapTwoNum {

    static void swap(int a, int b) {
        System.out.println("Before swapping: a = " + a + ", b = " + b);

        a = a ^ b;
        b = a ^ b; // a^b^b = a
        a = a ^ b; // a^b^a =b

        System.out.println("After swapping: a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        int a = 9;
        int b = 8;
        swap(a, b);
    }
}

/*
 * The numbers a and b in the main method are not changed after calling the swap
 * method because Java uses pass-by-value for method
 * arguments. This means that when you pass variables like a and b to the swap
 * method, Java passes copies of their values, not the actual variables
 * themselves. Any changes made to a and b inside the swap method do not affect
 * the original variables in the main method.
 */

/*
 * To make the swap method actually change the values of a and b in the main
 * method, you can use a wrapper object (e.g., an array) to hold the values.
 * Since objects are passed by reference, modifying the contents of the object
 * will reflect in the calling method.
 */

// public class SwapTwoNum {

// void swap(int[] nums) {
// System.out.println("Before swapping: a = " + nums[0] + ", b = " + nums[1]);

// nums[0] = nums[0] ^ nums[1];
// nums[1] = nums[0] ^ nums[1];
// nums[0] = nums[0] ^ nums[1];

// System.out.println("After swapping: a = " + nums[0] + ", b = " + nums[1]);
// }

// public static void main(String[] args) {
// SwapTwoNum swapper = new SwapTwoNum();

// int[] nums = {9, 8};

// swapper.swap(nums);
// System.out.println("After swapping in main: a = " + nums[0] + ", b = " +
// nums[1]);
// }
// }
