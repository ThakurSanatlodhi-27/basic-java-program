import java.util.*;
public class twoDArrays {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int [][]sanat=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sanat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print(sanat[i][j] + " ");
            }
            System.out.println();
        }

    
}
}
