package programmers;
import java.util.Arrays;
public class ChangeAB {
    public static int solution(String before, String after) {
        char[] a = before.toCharArray();
        char[] b = after.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);

        return new String(a).equals(new String(b)) ? 1 :0;
    }


    public static void main(String[] args) {
        String before = "olleh";
        String after = "hello";
        System.out.println(solution(before, after));
        String before2 = "allpe";
        String after2 = "apple";
        System.out.println(solution(before2, after2));
    }

}
