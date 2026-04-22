package day_0422.practice.payment;

public class CardPayment extends Payment {
    private String cardNumber;
    private String cardPassword;
    private int monthlyInstallment;

    public CardPayment(String shopName, String productName, long productPrice, String cardNumber, String cardPassword, int monthlyInstallment) {
        super(shopName, productName, productPrice);
        this.cardNumber = cardNumber;
        this.cardPassword = cardPassword;
        this.monthlyInstallment = monthlyInstallment;
    }

    @Override
    public String toString() {
        return String.format("[ 신용카드 결제 정보 ]" +
                "\n상점명: %s" +
                "\n상품명: %s" +
                "\n상품가격: %d" +
                "\n신용카드번호: %s" +
                "\n할부개월: %d",this.shopName,this.productName, this.productPrice, this.cardNumber, this.monthlyInstallment);
//        return "[ 신용카드 결제 정보 ]"+
//                "\n"+"상점명: "+this.shopName
//                +"\n"+"상품명: "+this.productName
//                +"\n"+"상품가격: "+this.productPrice
//                +"\n"+"신용카드번호: "+this.cardNumber
//                +"\n"+"할부개월: "+this.monthlyInstallment;
    }

    @Override
    public void pay() throws PayException {
        if (productPrice <= 0 || monthlyInstallment < 0) {
            throw new PayException("가격이나 할부개월수가 잘못되었습니다.");
        } else {
            System.out.println("신용카드가 정상적으로 지불되었습니다.");
        }
    }
}
