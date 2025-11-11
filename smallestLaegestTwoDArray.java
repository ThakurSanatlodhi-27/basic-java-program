import java.util.*;
public class smallestLaegestTwoDArray {
    public static void input(int matrix[][]){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
    }
    public static void output(int matrix[][]){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void check(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(smallest>matrix[i][j]){
                    smallest=matrix[i][j];
                }
                if(largest<matrix[i][j]){
                    largest=matrix[i][j];
                }
            }
            
        }
        System.out.println("smallest value of two d array is : "+smallest);
            System.out.println("largest value of two d array is : "+largest);

    }
    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
        {23,54,89,51},
        {87,41,62,35},
        {7,6,5,3}
          };
        //input(matrix);
        //output(matrix);
        check(matrix);
    }
    
}
