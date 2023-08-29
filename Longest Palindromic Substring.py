class Solution(object):

    def ispalindrome(self, s):
        return s==s[::-1]

    def longestPalindrome(self, s):
        """
        :type s: str
        :rtype: str
        """
        if len(s)==1:
            return s
        elif self.ispalindrome(s):
            return s
        else:
            longest_palindrome = ""
            for i in range(len(s)):
                for j in range(i+1,len(s)+1):
                    if self.ispalindrome(s[i:j]):
                        if len(s[i:j]) > len(longest_palindrome):
                            longest_palindrome = s[i:j]
            return longest_palindrome
        