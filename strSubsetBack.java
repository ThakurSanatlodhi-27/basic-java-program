public class strSubsetBack {
    public static void strSubset(String str,String ans,int i){
        if(i==str.length()){
            if(ans.length()==0){
                System.out.println("null");
            }else{
            System.out.println(ans);}
            return;
        }
        //yes
        strSubset(str,ans+str.charAt(i),i+1);
        //no
        strSubset(str,ans,i+1);

    }
    public static void main(String args[]){
        String san="abc";
        strSubset(san,"",0);

    }
    
}
