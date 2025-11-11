public class twoDArr3 {
    public static void trancepose(int matrix[][]){
        int nums[][]=new int[3][2];
        for(int i=0;i<2;i++){
            for(int j=0;j<3;j++){
               nums[j][i]= matrix[i][j];
                System.out.print(nums[j][i]);
            }
            System.out.println();
        }
    } 
    public static void main(String args[]){
        int matrix[][]={{1,2,3},{4,5,6}};
        trancepose(matrix);
    }
    
}
