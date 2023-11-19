package com.tut.MavenProject;

import java.util.Date;
import jakarta.persistence.Entity;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Transient;

@Entity
@Table(name="Address_student")
public class Address{
	@Id
	@GeneratedValue (strategy=GenerationType.IDENTITY)
	@Column(name="Address_id")
	private int Addressid;
	
	@Column(length=100)
	private String name;
	@Column(length=50)
	private String city;
	@Column(length=100)
	private String state;
	
	@Column(name="add_Date")
	@Temporal(TemporalType.DATE)
	private Date addedDate;
	@Transient
	private double x;
	
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(int addressid, String name, String city, String state, Date addedDate, double x) {
		super();
		this.Addressid = addressid;
		this.name = name;
		this.city = city;
		this.state = state;
		this.addedDate = addedDate;
		this.x = x;
	}

	public int getAddressid() {
		return Addressid;
	}

	public void setAddressid(int addressid) {
		Addressid = addressid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Date getAddedDate() {
		return addedDate;
	}

	public void setAddedDate(Date addedDate) {
		this.addedDate = addedDate;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Address [Addressid=" + this.Addressid + ", name=" + this.name + ", city=" + this.city + ", state=" + this.state
				+ ", addedDate=" + this.addedDate + ", x=" + this.x + "]";
	}
	
	
	


}
