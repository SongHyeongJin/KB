package day_0422.practice.payment;

public class CashPayment extends Payment{
    private String cashReceiptNumber;

    public CashPayment(String shopName, String productName, long productPrice, String cashReceiptNumber){
        super(shopName,productName,productPrice);
        this.cashReceiptNumber = cashReceiptNumber;
    }
    @Override
    public String toString() {
        return String.format("[ 현금 결제 정보 ]" +
                "\n상점명: %s" +
                "\n상품명: %s" +
                "\n상품가격: %d" +
                "\n현금영수증번호: %s", this.shopName, this.productName, this.productPrice, this.cashReceiptNumber);
    }
    @Override
    public void pay() throws PayException {
        if (productPrice <= 0 ) {
            throw new PayException("가격이 잘못되었습니다.");
        } else {
            System.out.println("현금이 정상적으로 지불되었습니다.");
        }
    }
}
