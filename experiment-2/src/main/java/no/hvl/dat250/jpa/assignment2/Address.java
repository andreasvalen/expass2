package no.hvl.dat250.jpa.assignment2;

import javax.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String street;
    private Integer number; 
    
    @ManyToMany(mappedBy="addresses", cascade = CascadeType.ALL)
    private Set<Person> owners = new HashSet<Person>();
    
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	
	public void setOwners(Person person) {
		 this.owners.add(person);
	}
	
	public Set<Person> getOwners() {
		return owners;
	}

	@Override
	public String toString() {
	  return getClass().getSimpleName()+": id- "+id+" " + "[owners=" + owners + "]";
	}
	

}
