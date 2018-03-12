package com.secVault.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Address")
public class AddressEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int addr_id;
	
	@Column
	private String addr_line1;
	
	@Column
	private String addr_line2;
	
	@Column
	private String city;
	
	@Column
	private String state;
	
	@Column
	private int zip;
	
	@Column
	private String country;

	/**
	 * @return the addr_id
	 */
	public int getAddr_id() {
		return addr_id;
	}

	/**
	 * @param addr_id the addr_id to set
	 */
	public void setAddr_id(int addr_id) {
		this.addr_id = addr_id;
	}

	/**
	 * @return the addr_line1
	 */
	public String getAddr_line1() {
		return addr_line1;
	}

	/**
	 * @param addr_line1 the addr_line1 to set
	 */
	public void setAddr_line1(String addr_line1) {
		this.addr_line1 = addr_line1;
	}

	/**
	 * @return the addr_line2
	 */
	public String getAddr_line2() {
		return addr_line2;
	}

	/**
	 * @param addr_line2 the addr_line2 to set
	 */
	public void setAddr_line2(String addr_line2) {
		this.addr_line2 = addr_line2;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @return the zip
	 */
	public int getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(int zip) {
		this.zip = zip;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

}
