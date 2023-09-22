# Q3. Largest Continuous Sequence Zero Sum
#
# Given an array A of N integers.
# Find the largest continuous sequence in a array which sums to zero.
#
# Problem Constraints
# 1 <= N <= 106
# -107 <= A[i] <= 107
#
# Input Format
# Single argument which is an integer array A.
#
# Output Format
# Return an array denoting the longest continuous sequence with total sum of zero.
# NOTE : If there are multiple correct answers, return the sequence which occurs first in the array.
#
# Example Input
# A = [1,2,-2,4,-4]
#
# Example Output
# [2,-2,4,-4]
#
# Example Explanation
# [2,-2,4,-4] is the longest sequence with total sum of zero.
class Solution:
	# @param A : list of integers
	# @return a list of integers
	def lszero(self, A):
        n = len(A)

        max_length = 0
        value = {0:-1} #Initializing the first element of an array to be 0
        psum = 0
        start,end =-1,-1

        for i in range(n):
            psum += A[i]

            if psum in value:
                if i - value[psum] > max_length:
                    start, end = value[psum] + 1, i
                    max_length = i - value[psum]
            else:
                value[psum] = i

        if start!=-1 and end!=-1:
            return A[start:end + 1]
        else:
            return []


    def main():
        sol = Solution()

        test_cases = [
            [1, 2, -3, 3],
            [1, 2, 3, 4, -10],
            [1, 2, 3],
            [-1, 1, -1, 1, -1, 1]
        ]

        for test in test_cases:
            print(f"Input: {test}, Output: {sol.lszero(test)}")





if __name__ == "__main__":
    main()