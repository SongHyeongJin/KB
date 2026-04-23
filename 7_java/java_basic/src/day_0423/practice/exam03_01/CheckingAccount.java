package day_0423.practice.exam03_01;

public class CheckingAccount extends Account {
	private String cardNo = "";

	public CheckingAccount(String accId,  String ownerName,long balance, String cardNo){
		super(accId, balance, ownerName);
		this.cardNo = cardNo;
	}
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	@Override
	public void calcRate() {

	}

	public void pay( String cardNo, long amount){
		if(cardNo.equals(getCardNo()) && amount < getBalance()){
			withdraw(amount);
		} else {
			System.out.println("지급이 불가능합니다.");
		}
	}
}
