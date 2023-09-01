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

# Time and Space Complexity
# TC:-O(n+m)
# SC:-O(n + min(n, m))



# The time and space complexity of this solution can be analyzed as follows:
#
# Time Complexity:
#
# Building the hashmap for array A: The loop runs for each element in array A, which has n elements. The dictionary operations inside the loop (hashmap.get() and hashmap[A[i]]) take constant time on average. Therefore, the time complexity of building the hashmap for array A is O(n).
#
# Finding common elements in array B: Similar to the previous loop, this loop runs for each element in array B, which has m elements. The dictionary operations inside this loop also take constant time. Therefore, the time complexity of finding common elements in array B is O(m).
#
# Combining both steps, the overall time complexity of the solution is O(n + m), where n is the size of array A and m is the size of array B.
#
# Space Complexity:
#
# hashmap: The space required to store the dictionary hashmap depends on the number of distinct elements in array A. In the worst case, all elements are distinct, and the dictionary would store n key-value pairs. Therefore, the space complexity for the hashmap is O(n).
#
# result list: The space required to store the common elements in the result list is proportional to the number of common elements between arrays A and B. In the worst case, where all elements are common, the list would store min(n, m) elements. Therefore, the space complexity for the result list is O(min(n, m)).
#
# Combining both factors, the overall space complexity of the solution is O(n + min(n, m)), where n is the size of array A and m is the size of array B.







