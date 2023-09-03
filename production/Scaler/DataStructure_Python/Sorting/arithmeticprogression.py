# Problem Description
# Given an integer array A of size N. Return 1 if the array can be arranged to form an arithmetic progression,
# otherwise return 0.
#
# A sequence of numbers is called an arithmetic progression if the difference between any two consecutive elements
# is the same.
#
# Problem Constraints
# 2 <= N <= 10^5
# -10^9 <= A[i] <= 10^9
#
# Input Format
# The first and only argument is an integer array A of size N.
#
# Output Format
# Return 1 if the array can be rearranged to form an arithmetic progression, otherwise return 0.
#
# Example Input
# Input 1:
#  A = [3, 5, 1]
# Input 2:
#  A = [2, 4, 1]
#
# Example Output
# Output 1:
#  1
# Output 2:
#  0
#
# Example Explanation
# Explanation 1:
#  We can reorder the elements as [1, 3, 5] or [5, 3, 1] with differences 2 and -2 respectively,
#  between each consecutive elements.
# Explanation 2:
#  There is no way to reorder the elements to obtain an arithmetic progression.
class Solution:
    def solve(self, A):
        A.sort()
        diff = A[1] - A[0]
        for i in range(1, len(A)):
            if A[i] - A[i - 1] != diff:
                return 0
        return 1

def main():
    # Example Input
    input_array1 = [3, 5, 1]
    input_array2 = [2, 4, 1]

    solution = Solution()
    output1 = solution.solve(input_array1)
    output2 = solution.solve(input_array2)

    print("Output 1:", output1)  # Output: 1
    print("Output 2:", output2)  # Output: 0

if __name__ == "__main__":
    main()
