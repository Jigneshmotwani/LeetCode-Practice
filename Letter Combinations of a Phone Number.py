class Solution(object):
    def letterCombinations(self, digits):
        char_dict = {}
        char_dict[2] = ["a", "b", "c"]
        char_dict[3] = ["d", "e", "f"]
        char_dict[4] = ["g", "h", "i"]
        char_dict[5] = ["j", "k", "l"]
        char_dict[6] = ["m", "n", "o"]
        char_dict[7] = ["p", "q", "r", "s"]
        char_dict[8] = ["t", "u", "v"]
        char_dict[9] = ["w", "x", "y", "z"]

        result = []
        a = 0
        
        if len(digits) == 0:
            return []
        elif len(digits) == 1:
            return char_dict[int(digits[0])]
        else:
            while a <len(digits):

                if a == 0:
                    for i in range(len(char_dict[int(digits[0])])):
                        result.append(char_dict[int(digits[0])][i])
                else:
                    temp = []
                    for i in range(len(result)):
                        for j in range(len(char_dict[int(digits[a])])):
                            temp.append(result[i] + char_dict[int(digits[a])][j])
                    result = temp
                a+=1
        return result



