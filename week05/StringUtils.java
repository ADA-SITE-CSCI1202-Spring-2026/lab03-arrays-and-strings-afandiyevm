import java.util.Arrays;


public class StringUtils {
    public static String reverse(String s) {
        String r = "";
        for (int i = 0; i < s.length(); i++){
            r = s.charAt(i) + r; 
        }
        return r;
    }

    public static void explode(String s) {
        for (int i =0; i < s.length(); i++) {
            System.out.println(s.substring(0, i));
        }
    }

    public static String sort(String s) {
    char[] c = s.toCharArray();
    Arrays.sort(c);
    return new String(c);
}

    public static boolean isAnagram(String s1, String s2) {
        String n_s1 = sort(s1);
        String n_s2 = sort(s2);

        return n_s1.equals(n_s2);
    }

    public static String swap(String s1) {
        StringBuilder sb = new StringBuilder();
        String[] s_s1 = s1.split(" ");
        for (int i = 0; i < s_s1.length; i++) {
            char[] c = s_s1[i].toCharArray();
            char temp = c[0];
            c[0] = c[c.length - 1];
            c[c.length -1] = temp;
            sb.append(c);
            sb.append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s1 = "tes1 swap";
        String a1 = "test";
        String a2 = "estt";
        System.out.println(reverse(s1));
        explode(s1);
        System.out.println(sort(s1));
        System.out.println(isAnagram(a1, a2));
        System.out.println(swap(s1));
        
    }
}
