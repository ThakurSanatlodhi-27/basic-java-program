import java.util.Scanner;
public class twoDArray {
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                System.out.println("key is found at index ("+i+","+j+")");
                return true;}

            }
        }
        System.out.println("key is not found");
        return false;}

    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int key=5;
        
        int matrix[][]=new int[3][3];
        int n=matrix.length;
        int m=matrix[0].length;

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();
        }
        search(matrix,5);
        
    }
    
}
