class Solution {
    public boolean checkIfPangram(String sentence) {
        int[] alphabets = new int[26];
        for (char c : sentence.toCharArray()) {
            alphabets[c - 96]++;
        }
        for (int i = 1; i < alphabets.length; i++) {
            if (!(alphabets[i] > 0)) {
                return false;
            }
        }
        return true;
    }
}