# Problem Description
# Given an integer array A of size N, find the first repeating element in it.
# We need to find the element that occurs more than once and whose index of the first occurrence is the smallest.
# If there is no repeating element, return -1.

# Problem Constraints
# 1 <= N <= 105
# 1 <= A[i] <= 109

# Input Format
# The first and only argument is an integer array A of size N.

# Output Format
# Return an integer denoting the first repeating element.

# Example Input
# Input 1:
#  A = [10, 5, 3, 4, 3, 5, 6]
# Input 2:
#  A = [6, 10, 5, 4, 9, 120]

# Example Output
# Output 1:
#  5
# Output 2:
#  -1

# Example Explanation
# Explanation 1:
#  5 is the first element that repeats
# Explanation 2:
#  There is no repeating element, output -1
class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        n = len(A)
        hashmap = {}
        for i in range(n):
            if (hashmap.get(A[i]) == None):
                hashmap[A[i]] = 1
            else:
                hashmap[A[i]] += 1

        max_length = 1
        keyy = None
        for key, value in hashmap.items():
            if value > 1:
                max_length = value
                keyy = key
                break

        if keyy == None:
            return -1
        else:
            return keyy


def main():
    A = [1, 2, 3, 4, 5, 1, 2]  # Example input
    solution = Solution()
    result = solution.solve(A)
    print("The element with the maximum frequency is:", result)


if __name__ == "__main__":
    main()


# Time complexity:-o(n+m)
# Space complexity-o(n)