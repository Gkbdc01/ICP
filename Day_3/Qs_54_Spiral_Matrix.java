class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rs = 0;
        int re = matrix.length-1;
        int cs = 0;
        int ce = matrix[0].length-1;
        ArrayList<Integer> al = new ArrayList<>();
        int te = matrix.length*matrix[0].length;
        while(te>0){
        for(int i = cs;i<=ce && te >0;i++){
            al.add(matrix[rs][i]);
            te--;
        }
        rs++;
        for(int i = rs;i<=re && te>0;i++){
            al.add(matrix[i][ce]);
            te--;
        }
        ce--;
        for(int i = ce;i>=cs && te >0;i--){
            al.add(matrix[re][i]);
            te--;
        }
        re--;
        for(int i = re;i>=rs && te>0;i--){
            al.add(matrix[i][cs]);
            te--;
        }
        cs++;
        }
        return al;
    }
}