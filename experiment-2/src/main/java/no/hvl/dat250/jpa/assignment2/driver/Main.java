package no.hvl.dat250.jpa.assignment2.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import no.hvl.dat250.jpa.assignment2.Address;
import no.hvl.dat250.jpa.assignment2.Bank;
import no.hvl.dat250.jpa.assignment2.CreditCard;
import no.hvl.dat250.jpa.assignment2.Person;
import no.hvl.dat250.jpa.assignment2.Pincode;

public class Main {
    public static final String PERSISTENCE_UNIT_NAME = "experiment2";

    public static void main(String[] args) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
        EntityManager em = factory.createEntityManager();
        em.getTransaction().begin();
        
        Address address = new Address();
        em.persist(address);
        address.setStreet("Inndalsveien");
        address.setNumber(28);
       
        
        Person person = new Person();
        em.persist(person);
        person.setName("Max Mustermann");
        person.setAddress(address);
        
        Pincode pin = new Pincode();
        em.persist(pin);
        pin.setCount(1);
        pin.setPincode("123");
        
        Bank bank = new Bank();
        em.persist(bank);
        bank.setName("Pengebank");
        
        CreditCard card1 = new CreditCard();
        em.persist(card1);
        card1.setNumber(12345);
        card1.setBalance(-5000);
        card1.setLimit(-10000);
        card1.setPincode(pin);
        card1.setOwningBank(bank);
        
        
        CreditCard card2 = new CreditCard();
        em.persist(card2);
        card2.setNumber(123);
        card2.setBalance(1);
        card2.setLimit(2000);
        card2.setPincode(pin);
        card2.setOwningBank(bank);
        
        List<CreditCard> creditCards = new ArrayList<>();
        creditCards.add(card1);
        creditCards.add(card2);
        person.setCreditCards(creditCards);
        
        em.getTransaction().commit();

        
        
        


        

        
        // TODO: Persist object world corresponding to the domain model of experiment 2.
    }
}
