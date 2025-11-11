public class twoDArr2 {
    public static void rowCount(int matrix[][]){
        int sum=0;
        for(int i=0;i<matrix[1].length;i++){
            sum+=matrix[1][i];

        }
        System.out.println(sum);

    }
    public static void main(String args[]){
        int matrix[][]={{14,25,68},{68,95,3,86},{98,35,17}};
        rowCount(matrix);
    }
    
    
}
