public class stringIsPalindrom {
    public static boolean ispalindrom(String san){
        int n=san.length();
        for(int i=0;i<n/2;i++){
            if(san.charAt(i)!=san.charAt(n-1-i)){
                return false;
            }

        }
        return true;
    }
    public static void main(String args[]){
        String sanat="moom";
        boolean ram=ispalindrom(sanat);
        System.out.println(ram);
    }
    
}
