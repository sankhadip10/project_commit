# Problem Description
# Given an integer array A, find if an integer p exists in the array such that the number of integers greater than p
# in the array equals p.
#
# Problem Constraints
# 1 <= |A| <= 2*10^5
# -10^8 <= A[i] <= 10^8
#
# Input Format
# First and only argument is an integer array A.
#
# Output Format
# Return 1 if any such integer p is present, else return -1.
#
# Example Input
# Input 1:
#  A = [3, 2, 1, 3]
# Input 2:
#  A = [1, 1, 3, 3]
#
# Example Output
# Output 1:
#  1
# Output 2:
#  -1
#
# Example Explanation
# Explanation 1:
#  For integer 2, there are 2 greater elements in the array.
# Explanation 2:
#  There exists no integer satisfying the required conditions.
class Solution:
    def solve(self, A):
        A.sort()
        n = len(A)
        for i in range(n):
            if A[i] == n - i - 1:
                if i < n - 1 and A[i] == A[i + 1]:
                    continue
                return 1
        return -1

def main():
    # Example Input
    input_array1 = [3, 2, 1, 3]
    input_array2 = [1, 1, 3, 3]

    solution = Solution()
    output1 = solution.solve(input_array1)
    output2 = solution.solve(input_array2)

    print("Output 1:", output1)  # Output: 1
    print("Output 2:", output2)  # Output: -1

if __name__ == "__main__":
    main()
