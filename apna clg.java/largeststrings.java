public class largeststrings {
    public static void largest(String sanat[]){
        String largest=sanat[0];
        for(int i=0;i<sanat.length;i++){
            if(largest.compareTo(sanat[i])<0){
                largest=sanat[i];
            }
        }
        System.out.println(largest);
    }
    public static void main(String args[]){
        String sanat[]={"apple","banana","mango","orange","guaua","pineapple"};
        largest(sanat);
    }
    
}
