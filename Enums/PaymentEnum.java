package Enums;

public enum PaymentEnum {
    DEBITCARD(5), CREDITCARD(10), CASH(0);

    int fee;

    PaymentEnum(int fee){
        this.fee = fee;
    }

    public int getFee(){
        return this.fee;
    }
}
