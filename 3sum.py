class Solution(object):
    def threeSum(self, nums):
        
        def twoSum(nums, target):
            d = set()
            res = []
            for i in range(len(nums)):
                if target - nums[i] in d:
                    res.append([target - nums[i], nums[i]])
                else:
                    d.add(nums[i])
            return res
        
        nums.sort()
        arr = []
        for k in range(len(nums) - 2):
            if k > 0 and nums[k] == nums[k - 1]:
                continue
                
            two_sum_target = -nums[k]
            two_sum_results = twoSum(nums[k + 1:], two_sum_target)
            
            if two_sum_results:
                for pair in two_sum_results:
                    if ([nums[k]] + pair) not in arr:
                        arr.append([nums[k]] + pair)
        
        return arr
