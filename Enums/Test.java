package Enums;

public class Test {
    
    public static void main(String[] args) {
        
        PaymentEnum pt = PaymentEnum.CASH;
        System.out.println(pt);

        PaymentEnum[] values = PaymentEnum.values();

        for (PaymentEnum paymentEnum : values) {
            System.out.println(paymentEnum);
            System.out.println(paymentEnum.ordinal());
            System.out.println(paymentEnum.getFee());
        }
    }
}
