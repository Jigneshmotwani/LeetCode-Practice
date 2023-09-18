class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        count = 0
        arr=list(s)
        for i in range(len(arr)):
            c = 0
            d = {}
            a = arr[i]
            j = i
            while (a not in d and j < len(arr)):
               
               d[a] = 1
               c+=1
               j+=1
               if(j < len(arr)):
                a = arr[j]
               
            if c > count:
                count = c
        return count
