class Solution {
    public int mostWordsFound(String[] sentences) {
        int result = 0;
        for (int i = 0; i < sentences.length; i++) {
            int words = 0;
            for (String word : sentences[i].split(" ")) {

                words++;
            }
            result = Math.max(result, words);
        }
        return result;
    }
}