package programmers;

public class CtrlZ {
    public static int solution(String s) {
        int answer = 0;
        String[] split = s.split(" ");

        for (int i = 0; i < split.length; i++) {
            if (split[i].equals("Z")) {
                answer -= Integer.parseInt(split[i-1]);
            }else {
                answer += Integer.parseInt(split[i]);
            }
        } return answer;
    }

    public static void main(String[] args) {
        String s1 = "1 2 Z 3";
        System.out.println(solution(s1));
        String s2 = "10 20 30 40";
        System.out.println(solution(s2));
        String s3 = "10 Z 20 Z 1";
        System.out.println(solution(s3));

    }
}
