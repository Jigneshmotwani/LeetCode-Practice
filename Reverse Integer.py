class Solution(object):
    def reverse(self, x):
        l_list = []
        y = x
        if y > 0:
            while y != 0:
                l_list.append(y%10)
                y = y/10
            l_list.reverse()
            l = len(l_list)
            for i in range(l):
                y += l_list[i]*10**(i)
                if y > 2**31-1 or y < -2**31:
                    return 0
            
            return y
        elif y < 0:
            y = y*-1
            while y != 0:
                l_list.append(y%10)
                y = y/10
            l_list.reverse()
            l = len(l_list)
            for i in range(l):
                y += l_list[i]*10**(i)
                if y > 2**31-1 or y < -2**31:
                    return 0
            
            return y*-1
        else:
            return 0