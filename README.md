# DSA_Questions

# Greddy problems:
1. Assign-cookie: Sort the array and use 2 pointers
2. Lemonade: Get track of the bills and use bigger bills first
3. Jump-Game: Check the maximum Index that can be reached
4. Jump-Gane2: Solve using recurssion bt trying all possible ways and then Optimise it using DP ||  solve it by finding the Range that can be reached in jumps
5. Fractional-Knapsack: solve it using considering profilt/weight

# Sorting algorithms:
1. Selection: Select the miniMum or maxiMum element from the array and swap with the starting index

# Bit manipulation:
| Problem          | Description                                                                                   | Time Complexity       | Space Complexity      |
|-------------------|-----------------------------------------------------------------------------------------------|-----------------------|------------------------|
| DecimalToBinary   | Find remainder using `num % 2` and add to string, then divide `num` by 2 (`num / 2`).         | O(log₂(num))          | O(log₂(num))          |
| BinaryToDecimal   | Traverse from right to left, calculate the base (powers of 2) and add to the number.          | O(n)                  | O(1)                  |
| SwapTwoNum        | Swap two numbers using XOR as `a^a = 0`, hence `a^b^a = b`.                                   | O(1)                  | O(1)                  |
| SetOrUnSet        | Use `(num & (1 << i))` (left shift) or `((num >> i) & 1)` (right shift).                      | O(1)                  | O(1)                  |
| setBit            | Use formula `(num | (1 << i))`, as `0 | 0 = 0` and `0 | 1 = 1`.                               | O(1)                  | O(1)                  |
