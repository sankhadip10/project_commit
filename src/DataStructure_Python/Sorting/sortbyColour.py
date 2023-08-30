# Problem Description
# Given an array with N objects colored red, white, or blue, sort them so that objects of the same color
# are adjacent, with the colors in the order red, white, and blue.
#
# We will represent the colors as,
# red -> 0
# white -> 1
# blue -> 2
#
# Note: Using the library sort function is not allowed.
#
# Problem Constraints
# 1 <= N <= 1000000
# 0 <= A[i] <= 2
#
# Input Format
# First and only argument of input contains an integer array A.
#
# Output Format
# Return an integer array in the required order.
#
# Example Input
# Input 1:
#     A = [0, 1, 2, 0, 1, 2]
# Input 2:
#     A = [0]
#
# Example Output
# Output 1:
#     [0, 0, 1, 1, 2, 2]
# Output 2:
#     [0]
#
# Example Explanation
# Explanation 1:
#     [0, 0, 1, 1, 2, 2] is the required order.
# Explanation 2:
#     [0] is the required order.
class Solution:
    def sortColors(self, A):
        low, mid, high = 0, 0, len(A) - 1

        while mid <= high:
            if A[mid] == 0:
                A[low], A[mid] = A[mid], A[low]
                low += 1
                mid += 1
            elif A[mid] == 1:
                mid += 1
            else:
                A[mid], A[high] = A[high], A[mid]
                high -= 1
        return A

def main():
    # Example Input
    input_array1 = [0, 1, 2, 0, 1, 2]
    input_array2 = [0]

    solution = Solution()
    output1 = solution.sortColors(input_array1)
    output2 = solution.sortColors(input_array2)

    print("Output 1:", output1)  # Output: [0, 0, 1, 1, 2, 2]
    print("Output 2:", output2)  # Output: [0]

if __name__ == "__main__":
    main()
