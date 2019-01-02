package entities;

public class Account {

	private int number;
	private String holder;
	private double balance;
	private double initialValue;
	public Account(int number, String holder) {
		this.number = number;
		this.holder = holder;
	}
	public Account(int number, String holder, double initialValue) {
		this.number = number;
		this.holder = holder;
		deposit(initialValue);
	}
	public int getNumber() {
		return number;
	}
	public String getHolder() {
		return holder;
	}
	public void setHolder(String holder) {
		this.holder = holder;
	}
	public double getInitialValue() {
		return initialValue;
	}
	
	public void deposit (double amount) {
		balance+=amount;
	}
	
	public void withdraw (double amount) {
		balance-=amount + 5.0;
	}
	public String toString () {
			return "Account "
			+ number
			+" Holder: "
			+ holder
			+" Balance $ "
			+ String.format("%.2f", balance);
			
	}
	
}