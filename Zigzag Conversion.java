class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1){
            return s;
        }
        String result = "";
        for(int i =0; i<numRows;i++){
            int j = 0;
            boolean flag = true;
            while (flag){
                int a = (int) (Math.pow(numRows-1, j) + i);
                if(a<0 || a>=s.length()){
                    flag = false;
                    break;
                }
                result += s.charAt(a);
                int b = (int) (Math.pow(numRows-1, j+1) - i);
                if(b<0 || b>=s.length()){
                    flag = false;
                    break;
                }
                result += s.charAt(b);
                j++;
            }
        }
        return result;
    }
}