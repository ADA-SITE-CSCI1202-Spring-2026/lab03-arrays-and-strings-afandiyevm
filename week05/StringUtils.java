import java.util.Arrays;

public class StringUtils {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String s1;
        s1 = "ZDEF";

        char arr1[] = s1.toCharArray();
        Arrays.sort(arr1);
        System.out.println(arr1);
        
        
    }
}
