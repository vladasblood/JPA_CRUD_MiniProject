package com.sa2;

/**
 * Hello world!
 *
 */
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "memberjollibee")
public class Member implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "memberID", unique = true)
	private int id;
	
	@Column(name = "Position", nullable = false)
	private String position;
	
	@Column(name = "firstName", nullable = false)
	private String fName;
	
	@Column(name = "middleName", nullable = true)
	private String mName;
	
	@Column(name = "lastName", nullable = false)
	private String lName;

	@Column(name = "Address", nullable = false)
	private String address;

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getmName() {
		return mName;
	}

	public void setmName(String mName) {
		this.mName = mName;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getfName() {
		return fName;
	}

	public void setfName(String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	public void setlName(String lName) {
		this.lName = lName;
	}
	
}
	

