public class commpresionstrings {

    public static String compress(String sanat) {
        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < sanat.length(); i++) {
            int count = 1;

            while (i < sanat.length() - 1 && sanat.charAt(i) == sanat.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(sanat.charAt(i));
            if (count > 1) {
                sb.append(count);
            }
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        String sanat = "aaaabbbbbcccdd";
        System.out.println(compress(sanat));
    }
}
