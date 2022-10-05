package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;
import java.util.Collection;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Collection<Address> addresses;
    private Collection<CreditCard> creditCards;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Collection<Address> getAddresses() {
		return addresses;
	}


	public void setAddresses(Collection<Address> addresses) {
		this.addresses = addresses;
	}


	public Collection<CreditCard> getCreditCards() {
		return creditCards;
	}


	public void setCreditCards(Collection<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}



}
