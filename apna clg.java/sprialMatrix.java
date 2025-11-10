
public class sprialMatrix {
    public static void sprial(int matrix[][]){
        int startrow=0;
        int endrow=matrix.length-1;
        int startcolumn=0;
        int endcolumn=matrix[0].length-1;

        while(startrow<=endrow && startcolumn<=endcolumn){

        for(int i=startcolumn;i<=endcolumn;i++){
            System.out.print(matrix[startrow][i]+" ");
            
        }startrow++;
        for(int i=startrow;i<=endrow;i++){
            
            System.out.print(matrix[i][endcolumn]+" ");
            
        }endcolumn--;
        for(int i=endcolumn;i>=startcolumn;i--){
            if(startrow==endrow){
                break;
            }
            System.out.print(matrix[endrow][i]+" ");
           
        } endrow--;
        for(int i=endrow;i>=startrow;i--){
            if(startcolumn==endcolumn){
                break;
            }
            System.out.print(matrix[i][startcolumn]+" ");
            
        }startcolumn++;
    }
    System.out.println();
    }
    public static void sprial1(int matrix[][]){
        int srow=0;
        int erow=matrix.length-1;
        int scolm=0;
        int ecolm=matrix[0].length-1;
        while(srow<=erow && scolm<=ecolm){

        for(int i=scolm;i<=ecolm;i++){
            System.out.print(matrix[srow][i]+" ");
        }
        for(int i=srow+1;i<=erow;i++){
            System.out.print(matrix[i][ecolm]+" ");
        }
        for(int i=ecolm-1;i>=scolm;i--){
            if(srow==erow){
                break;
            }
            System.out.print(matrix[erow][i]+" ");
        }
        for(int i=erow-1;i>=srow+1;i--){
            if(scolm==ecolm){
                break;
            }
            System.out.print(matrix[i][scolm]+" ");
        }
    
        srow++;
        erow--;
        scolm++;
        ecolm--;
    }
}

    public static void main(String args[]){
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
                       sprial1(matrix);
    
    
}
}
