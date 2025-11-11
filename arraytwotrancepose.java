import java.util.*;
public class arraytwotrancepose {
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][]sanat=new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                sanat[i][j]=sc.nextInt();
            }
            
        }
        for(int j=0;j<m;j++){
            for(int i=0;i<n;i++){
                System.out.print(sanat[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
