import java.util.Arrays;
public class anagram {
    public static String check(String sanat,String ritik){

        sanat=sanat.toLowerCase();
        ritik=ritik.toLowerCase();

         if(sanat.length()==ritik.length()){

            char sanatarray[]=sanat.toCharArray();
            char ritikarray[]=ritik.toCharArray();

            Arrays.sort(sanatarray);
            Arrays.sort(ritikarray);

            boolean result=Arrays.equals(sanatarray,ritikarray);
            if(result){
                System.out.println("string are equal");
            }else{
                System.out.println("string are not equals");
            }

            

         }else{
            System.out.println("String are not equals");
         }
         return sanat;
         
         
    }
    public static void main(String args[]){
        String sanat="mug";
        String ritik="gum";
        check(sanat,ritik);
    }
    
}
