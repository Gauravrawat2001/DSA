class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;

        int fr = 0, lr = matrix.length - 1, fc = 0, lc = matrix[0].length - 1;
        int count = 0;

        List<Integer> res = new ArrayList<>();
    
        while(count <= rows * cols){

            // for first row 
            for(int i = fc ; i <= lc; i++){
                res.add(matrix[fr][i]);
                count++;
            }
            fr++;

            // for last colmn
            for(int i = fr; i <= lr; i++){
                res.add(matrix[lc][i]);
                count++;
            }
            lc--;

            // for last row 
            for(int i = lc ; i >= fc; i--){
                res.add(matrix[lr][i]);
                count++;
            }
            lr--;

            // for first column
            for(int i = lr ; i >= fr; i--){
                res.add(matrix[i][fc]);
                count++;
            }
            fc++;
        }
        return res;
    }
}
