package no.hvl.dat250.jpa.assignment2;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
public class Pincode {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String pincode;
    private Integer count;

    public Long getId() {
        return id;
    }

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public Integer getCount() {
		return count;
	}

	public void setCount(Integer count) {
		this.count = count;
	}

}
