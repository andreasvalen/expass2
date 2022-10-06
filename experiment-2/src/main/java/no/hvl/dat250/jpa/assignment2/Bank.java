package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    
    @OneToMany(mappedBy="owningBank", cascade = CascadeType.ALL)
    private Set<CreditCard> ownedCards = new HashSet<CreditCard>();
    
	public Long getId() {
		return id;
	}
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<CreditCard> getOwnedCards() {
		return ownedCards;
	}
	public void setOwnedCards(CreditCard card) {
		this.ownedCards.add(card);
	}

}
