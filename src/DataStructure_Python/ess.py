class Solution:
    # @param A : list of integers
    # @return an integer
    def solve(self, A):
        # sort the array
        A.sort()
        start = A[0]
        length = len(A)
        print(length)
        for i in range(length):
            print("i: ",i)
            if (start!=A[i]) and (start == (length - i)):
                print(start)
                return 1
            start = A[i]
        if start==0:
            return 1
        return -1


def main():
    # Create an instance of the Solution class
    solution_instance = Solution()

    # Example lists to test the function
    test_list1 = [-4,2,0,3,4]
    # test_list2 = [1, 2, 3, 4, 5]

    # Call the solve method and print the results
    print("Result for test_list1:", solution_instance.solve(test_list1))  # Should return -1
    # print("Result for test_list2:", solution_instance.solve(test_list2))  # Should return -1


if __name__ == "__main__":
    main()
