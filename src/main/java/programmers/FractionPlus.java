package programmers;

public class FractionPlus {
    public static int[] solution(int numer1, int denom1, int numer2, int denom2) {
        // 1. 두 분수의 합계산
        int numerator = (numer1 * denom2) + (numer2 * denom1);
        int denominator = denom1 * denom2;

        // 2. 최대공약수(gcd) 계산
        int gcd = gcd(numerator,denominator);

        // 3. gcd로 나워주기(기약분수 만들기)

        int[] answer = {numerator/gcd, denominator/gcd};
        return answer;
    }

    public static int gcd(int a, int b) {
        if (a <= b) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (b == 0) return a;
        return gcd(b, (a%b));
    }

    public static void main(String[] args) {
        FractionPlus fractionPlus = new FractionPlus();
        System.out.println(fractionPlus.solution(1, 2, 3, 4));

    }

}


