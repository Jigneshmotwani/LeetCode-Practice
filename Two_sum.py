class Solution(object):
    def twoSum(self, nums, target):
        l = len(nums)
        dict = {}
        for i in range(l):
            if nums[i] in dict.values():
                return [nums.index(target-nums[i]), i]
            dict[i] = target-nums[i]
        