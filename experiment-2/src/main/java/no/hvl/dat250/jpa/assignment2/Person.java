package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @ManyToMany
	@JoinTable(
	    	name = "person_Adress_mtm2"/*
	    	joinColumns = @JoinColumn(name = "person_id"), 
	    	inverseJoinColumns = @JoinColumn(name = "address_id")*/)
    private List<Address> addresses = new ArrayList<Address>();
    
    private List<CreditCard> creditCards;

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Collection<Address> getAddresses() {
		return addresses;
	}

	
	public void setAddress(Address address) {
		this.addresses.add(address);
		address.setOwners(this);
	}


	public Collection<CreditCard> getCreditCards() {
		return creditCards;
	}


	public void setCreditCards(List<CreditCard> creditCards) {
		this.creditCards = creditCards;
	}



}
