package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

@Entity
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Integer number;
    private Integer balance;
    private Integer limit;
    
    private Pincode pincode;
    
    @ManyToOne(targetEntity = Bank.class)
    private Bank owningBank;
    
    public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Integer getBalance() {
		return balance;
	}
	public void setBalance(Integer balance) {
		this.balance = balance;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Bank getOwningBank() {
		return owningBank;
	}
	public void setOwningBank(Bank owningBank) {
		this.owningBank = owningBank;
		owningBank.setOwnedCards(this);
	}
	public Pincode getPincode() {
		return pincode;
	}
	public void setPincode(Pincode pincode) {
		this.pincode = pincode;
	}




}
