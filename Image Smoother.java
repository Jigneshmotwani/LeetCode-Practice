class Solution {
    public int[][] imageSmoother(int[][] img) {
        int[][] smooth_img = new int[img.length][img[0].length];
        for (int i = 0; i < smooth_img.length; i++) {
            for (int j = 0; j < smooth_img[0].length; j++) {
                int sum = 0;
                int count = 0;
                if (i - 1 >= 0) {
                    if (j - 1 >= 0) {
                        sum += img[i - 1][j - 1];
                        count++;
                    }
                    sum += img[i - 1][j];
                    count++;
                    if (j + 1 < smooth_img[0].length) {
                        sum += img[i - 1][j + 1];
                        count++;
                    }
                }
                if (j - 1 >= 0) {
                    sum += img[i][j - 1];
                    count++;
                }
                sum += img[i][j];
                count++;
                if (j + 1 < smooth_img[0].length) {
                    sum += img[i][j + 1];
                    count++;
                }
                if (i + 1 < smooth_img.length) {
                    if (j - 1 >= 0) {
                        sum += img[i + 1][j - 1];
                        count++;
                    }
                    sum += img[i + 1][j];
                    count++;
                    if (j + 1 < smooth_img[0].length) {
                        sum += img[i + 1][j + 1];
                        count++;
                    }
                }
                smooth_img[i][j] = sum / count;
            }
        }
        return smooth_img;
    }
}