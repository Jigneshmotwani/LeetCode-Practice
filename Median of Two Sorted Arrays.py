class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        nums = []
        m = len(nums1)
        n = len(nums2)
        i = 0
        j = 0
        for k in range(m+n):
            if (i>=m and j>=n):
                break
            if (i>=m):
                nums.append(nums2[j])
                j += 1
            elif (j>=n):
                nums.append(nums1[i])
                i += 1

            elif nums1[i] < nums2[j]:
                nums.append(nums1[i])
                i += 1
            else:
                nums.append(nums2[j])
                j += 1
        s = len(nums)
        if s%2==0:
            return (nums[s//2]+nums[s//2-1])/2.0
        else:
            return nums[s//2]  