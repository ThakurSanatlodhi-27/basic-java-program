public class twoDArr1 {
    public static void count(int matrix[][],int key){
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    sum+=1;

                }
            }
            
        }System.out.println(sum);

    }
    public static void main(String args[]){
        int matrix[][]={{25,32,69,54},{56,54,37,35},{54,12,28,94}};
        int key=54;
        count(matrix,key);
    }
    
}
