import java.util.*;
public class twoDArrays1 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][]sanat=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                sanat[i][j]=sc.nextInt();
            }
        }

        int x=sc.nextInt();
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                if(sanat[i][j]==x){
                    System.out.println("x is found : " + i + j );
                }
            }
        }
    }
    
}
