# Problem Description
# Given two integer arrays, A and B of size N and M, respectively. Your task is to find all the common elements in both arrays.
#
# NOTE:
# Each element in the result should appear as many times as it appears in both arrays.
# The result can be in any order.
#
# Problem Constraints
# 1 <= N, M <= 105
# 1 <= A[i] <= 109
#
# Input Format
# First argument is an integer array A of size N.
# Second argument is an integer array B of size M.
#
# Output Format
# Return an integer array denoting the common elements.
#
# Example Input
# Input 1:
#  A = [1, 2, 2, 1]
#  B = [2, 3, 1, 2]
# Input 2:
#  A = [2, 1, 4, 10]
#  B = [3, 6, 2, 10, 10]
#
# Example Output
# Output 1:
#  [1, 2, 2]
# Output 2:
#  [2, 10]
#
# Example Explanation
# Explanation 1:
#  Elements (1, 2, 2) appears in both the array. Note 2 appears twice in both the array.
# Explanation 2:
#  Elements (2, 10) appears in both the array.

# Remember this line next when I just say "gf do it"

class Solution:
    def solve(self, A, B):
        n = len(A)
        m = len(B)
        hashmap = {}

        for i in range(n):
            if hashmap.get(A[i]) is None:
                hashmap[A[i]] = 1
            else:
                hashmap[A[i]] += 1
        result = []

        for i in range(m):
            if hashmap.get(B[i]) is not None and hashmap[B[i]] != 0:
                result.append(B[i])
                hashmap[B[i]] -= 1
        return result

def main():
    # Create an instance of the Solution class
    solution = Solution()

    # Example inputs
    A1 = [1, 2, 2, 1]
    B1 = [2, 3, 1, 2]

    A2 = [2, 1, 4, 10]
    B2 = [3, 6, 2, 10, 10]

    # Use the solve method to find common elements
    result1 = solution.solve(A1, B1)
    result2 = solution.solve(A2, B2)

    # Print the results
    print(result1)  # Output: [1, 2, 2]
    print(result2)  # Output: [2, 10]

if __name__ == "__main__":
    main()
