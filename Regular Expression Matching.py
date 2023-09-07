class Solution(object):
    def isMatch(self, s, p):
        s_list = list(s)
        p_list = list(p)
        i = 0
        j = 0
        if len(s) > len(p):
            return False
        while i != len(s):
            if p_list[j] == s_list[i]:
                i += 1
                j += 1
            elif p_list[j] == ".":
                i += 1
                j += 1
            elif p_list[j] == "*":
                