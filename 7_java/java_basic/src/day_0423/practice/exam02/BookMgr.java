package day_0423.practice.exam02;

import day_0420.dogcat.objectCasting.B;

public class BookMgr {
	protected Book[] booklist;
	public BookMgr(Book[] booklist) {
		this.booklist=booklist;
	}
	
	public void printBooklist(){
		for (int i = 0; i < booklist.length; i++) {
			System.out.println(booklist[i].getTitle());
		}
	}
	
	public void printTotalPrice(){
		int totalPrice = 0;
		for (int i = 0; i < booklist.length; i++) {
			totalPrice+=booklist[i].getPrice();
		}
		System.out.println("전체 책 가격의 합"+totalPrice);
	}
}
