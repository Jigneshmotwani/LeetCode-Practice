
class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newcolor) {

        int parentcolor = image[sr][sc];

        if (parentcolor == newcolor) {
            return image;
        }
        reccursion(image, sr, sc, parentcolor, newcolor);

        return image;

    }

    void reccursion(int[][] image, int a, int b, int parentcolor, int newcolor) {

        if (a < 0 || a >= image.length || b < 0 || b >= image[0].length || image[a][b] != parentcolor) {
            return;
        }

        image[a][b] = newcolor;
        reccursion(image, a + 1, b, parentcolor, newcolor);
        reccursion(image, a - 1, b, parentcolor, newcolor);
        reccursion(image, a, b + 1, parentcolor, newcolor);
        reccursion(image, a, b - 1, parentcolor, newcolor);

    }
}