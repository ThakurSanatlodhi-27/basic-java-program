public class upperCaseLatter {
    public static String toupper(String sanat){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(sanat.charAt(0));
        sb.append(ch);
        for(int i=1;i<sanat.length();i++){
            if(sanat.charAt(i)==' ' &&i<sanat.length()-1){
                sb.append(sanat.charAt(i));
                i++;
                ch=Character.toUpperCase(sanat.charAt(i));
                sb.append(ch);
            }
            else{
                sb.append(sanat.charAt(i));
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
    public static void main(String args[]){
        String sanat="my name is ritik singh Rajput";
        toupper(sanat);

    }
    
}
