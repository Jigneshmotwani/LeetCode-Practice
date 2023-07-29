class Solution {
    public String reverseWords(String s) {

        String[] words = s.split(" ");
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            String[] c = words[i].trim().split("");
            for (int j = 0; j < c.length / 2; j++) {
                String temp = c[j];
                c[j] = c[c.length - 1 - j];
                c[c.length - 1 - j] = temp;
            }
            builder.append(String.join("", c)).append(" ");
        }
        return builder.toString().trim();
    }
}