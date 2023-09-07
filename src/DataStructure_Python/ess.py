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
def calculate_prefix_sum(input_array):
    n = len(input_array)
    prefix_sum = [0] * n
    print("_-_-_-_-_-_-_>",prefix_sum)
    prefix_sum[0] = input_array[0]
    print(prefix_sum)
    for i in range(1, n):
        print(i)
        prefix_sum[i] = prefix_sum[i - 1] + input_array[i]

input_array = [1, 2, 3]
prefix_sum = calculate_prefix_sum(input_array)
print(prefix_sum)  # Output: [1, 3, 6, 10, 15]
num_str=[2,3,6]
subseq = num_str[0:1]
print(subseq)
