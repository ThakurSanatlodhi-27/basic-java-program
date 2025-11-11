public class stringsQues1 {
    public static String vowels(String sanat){
        StringBuilder sb=new StringBuilder("");
        Integer count=0;
        for(int i=0;i<sanat.length();i++){
            char ch=sanat.charAt(i);
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                count++;
            }
        }
        sb.append(count);
        return sb.toString();
    }
    public static void main(String args[]){
        String sanat="my name is sanat lodhi";
        System.out.println(vowels(sanat));
    }
    
}
