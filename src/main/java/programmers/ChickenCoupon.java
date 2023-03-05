package programmers;



public class ChickenCoupon {

    public static int Solution(int chicken) {
        int coupon = chicken;
        int service = 0;

        while ( coupon >= 10) {
            service += coupon/10;
            coupon = coupon%10 + coupon/10;
        }
        return service;
    }

    public static void main(String[] args) {
        ChickenCoupon chickenCoupon = new ChickenCoupon();
        System.out.println(chickenCoupon.Solution(100));
        System.out.println(chickenCoupon.Solution(1081));
    }

}
