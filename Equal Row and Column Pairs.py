from collections import defaultdict


class Solution(object):
    def equalPairs(self, grid):
        l = len(grid[0])
        count = 0
        m = defaultdict(int)
        
        for i in grid:
            m[str(i)] += 1
        
        
        
        for i in range(l):
            t2 = []
            for j in range(l):
                t2.append(grid[j][i])
            count += m[str(t2)]
        return count   
                