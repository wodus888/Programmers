package programmers;

import java.util.HashMap;

public class Rock_Paper_Scissors {
    public String Solution(int num) {
        HashMap<String, Character> rsp = new HashMap<>();
        rsp.put("2", '0');
        rsp.put("0", '5');
        rsp.put("5", '2');
        StringBuilder sb = new StringBuilder();
        int length = sb.length();
        for (int i = 0; i < length; i++) {
            sb.setCharAt(i, rsp.get(String.valueOf(sb.charAt(i))));
        }
        String answer = sb.toString();
        return answer;

    }
    
}
