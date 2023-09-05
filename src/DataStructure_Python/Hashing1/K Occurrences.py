class Solution:
    # @param A : integer
    # @param B : integer
    # @param C : list of integers
    # @return an integer
    def getSum(self, A, B, C):
        dic = {}
        MOD = 10 ** 9 + 7
        for i in range(A):
            if C[i] in dic:
                dic[C[i]] += 1
            else:
                dic[C[i]] = 1

        res = 0
        found = False
        for key, value in dic.items():
            if value == B:
                res += key
                found = True

        if not found:
            return -1
        else:
            return res % MOD

# // TC - O(N)
# // SC - O(N)


