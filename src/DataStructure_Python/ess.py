# freq_A={"1":'33','2':'45'}

# for key,value in freq_A.items():
#     print(key[0],value[0])

# x = [1, 2, 3, 4, 5, 7, 77, 56, 45, 20]
# for i in range(len(x)-1, 0,-1):
#     print(x[i])



# def get_subarrays(arr):
#     subarrays = []
#     for start in range(len(arr)):
#         print("---")
#         for end in range(start + 1, len(arr) + 1):
#             print(start)
#             subarray = arr[start:end]
#             subarrays.append(subarray)
#             print(subarrays)
#     return subarrays
#
# # Example usage:
# my_array = [1, 2, 3]
# subarrays = get_subarrays(my_array)
# print(subarrays)

# def calculate_prefix_sum(input_array):
#     n = len(input_array)
#     prefix_sum = [0] * n
#     print(prefix_sum)
#
# input_array = [1, 2, 3, 4, 5]
# prefix_sum = calculate_prefix_sum(input_array)
# print(prefix_sum)
# def calculate_prefix_sum(input_array):
#     n = len(input_array)
#     prefix_sum = [0] * n
#     print("_-_-_-_-_-_-_>",prefix_sum)
#     prefix_sum[0] = input_array[0]
#     print(prefix_sum)
#     for i in range(1, n):
#         print(i)
#         prefix_sum[i] = prefix_sum[i - 1] + input_array[i]
#
# input_array = [1, 2, 3]
# prefix_sum = calculate_prefix_sum(input_array)
# print(prefix_sum)  # Output: [1, 3, 6, 10, 15]
# num_str=[2,3,6]
# subseq = num_str[0:1]
# print(subseq)


# def printt(n):
#     print("yyyy")
#     if n == 1:
#         print(n)
#         return
#
#     printt(n - 1)
#     print(n)
#
# printt(5)
# def printt(n):
#     print("yyyy")
#     if n == 1:
#         print(n)
#         return
#
#     printt(n - 1)
#     print(n)
#
#
#
#
# printt(5)


# def printt(n):
#     if n == 1:
#         print(n)
#         return  # This ensures that the function doesn't proceed further once n is 1.
#
#     printt(n - 1)
#     print(n)
#
#
# printt(5)  # This will print numbers 1 to 5


# def twoSum(nums, target):
#     num_map = {}  # To store the number and its index
#
#     for i, num in enumerate(nums):
#         complement = target - num
#         print(complement)
#         if complement in num_map:
#             # Adding 1 to each index because we're not using 0-based indexing.
#             return [num_map[complement] + 1, i + 1]
#         num_map[num] = i
#         print("--",num_map)
#
# twoSum([7,11,2,15],9)

# list1 = [(1, 'a'), (2, 'b')]
# l1,l2=zip(*list1)
# print(l1)
# print(l2)

# def is_less_or_equal(word1, word2):
#     for c1, c2 in zip(word1, word2):
#         print(c1,c2)
#
# is_less_or_equal('sclaer','gaterj')

# A = ["hello", "scaler", "interviewbit"]
# for i in range(len(A) - 1):
#     print(A[i])

#
# for i in range(0, 9, 3):
#     for j in range(0, 9, 3):
#         print([i])
#         print([j])

# def isValidSudoku(board):
#     for i in range(9):
#         # Check row
#         row = [board[i][j] for j in range(9) if board[i][j] != '.']
#         print(row)
#         if len(row) != len(set(row)):
#             return 0
#
#
# isValidSudoku(["53..7....", "6..195...", ".98....6.", "8...6...3", "4..8.3..1", "7...2...6", ".6....28.", "...419..5", "....8..79"])
# A="bcdaef"
# print(min(A))
# first_char_index = A.index(min(A))
# print(first_char_index)

# A='abcdab'
# freq = {}
# for char in A:
#     freq[char] = freq.get(char, 0) + 1
#     print(freq)

# class Solution:
#     # @param A : string
#     # @return a strings
#     def solve(self, A):
#         minchar = 'z'
#         idx = 1000000000
#         for i in range(len(A) - 1):
#             if A[i] < minchar:
#                 minchar = A[i]
#                 idx = i
#

#         minchar2 = 'z'
#         for i in range(idx + 1, len(A)):
#             if (A[i] < minchar2):
#                 minchar2 = A[i]
#
#         ans = minchar + minchar2
#         return ans
#
# def main():
#     solution =Solution()
#     A="badc"
#     res=solution.solve(A)
#     print(res)
#
# if __name__ == "__main__":
#     main()
#
# A=[1,2,3,4,5]
# for j, num in enumerate(A):
#     print(j,num)










