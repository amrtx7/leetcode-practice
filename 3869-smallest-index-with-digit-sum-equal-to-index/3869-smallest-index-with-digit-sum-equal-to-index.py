class Solution:
    def sumOfDigits(self,n):
        sum=0
        while(n):
            sum+=n%10
            n//=10
        return sum

    def smallestIndex(self, nums: List[int]) -> int:
        for i in range(0,len(nums)):
            if self.sumOfDigits(nums[i]) == i : return i
        return -1