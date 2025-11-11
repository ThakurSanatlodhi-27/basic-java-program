public class stringShortestPath {
    public static float shortestPath(String san){
        
        int x=0;
        int y=0;
        for(int i=0;i<san.length();i++){
            char darection=san.charAt(i);
            if(darection=='E'){
                x+=1;
            }
            else if(darection=='W'){
                x-=1;
            }
            else if(darection=='N'){
                y+=1;

            }
            else{
                y-=1;
            }
        }
        int X2=x*x;
        int Y2=y*y;
        float total=(float)Math.sqrt(X2+Y2);
        return total;

        }
    
    public static void main(String args[]){
        String sanat="WNEENESENNN";
        System.out.println(shortestPath(sanat));
    }
    
}
