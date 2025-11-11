import java.util.*;
public class checkTwoDArray{
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
    public static boolean check(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key is found at index("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.println("key is not found at index");
        return false;
    }
    public static void main(String args[] ){
        int matrix[][]=new int[3][3];
        input(matrix);
        output(matrix);
        check(matrix,11);
    }

    
    }

    

