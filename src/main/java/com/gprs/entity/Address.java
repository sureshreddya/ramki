package com.gprs.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ADRSMSTDTL")
public class Address implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String addessId;
	
	private String houseNo;
	
	private String streetName;
	
	private String landmark;
	
	private String city;
	
	private String distict;
	
	private String state;
	
	private String country;
	
	private String zipCode;

	/**
	 * @return the addessId
	 */
	public String getAddessId() {
		return addessId;
	}

	/**
	 * @param addessId the addessId to set
	 */
	public void setAddessId(String addessId) {
		this.addessId = addessId;
	}

	/**
	 * @return the houseNo
	 */
	public String getHouseNo() {
		return houseNo;
	}

	/**
	 * @param houseNo the houseNo to set
	 */
	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	/**
	 * @return the streetName
	 */
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @param streetName the streetName to set
	 */
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @return the landmark
	 */
	public String getLandmark() {
		return landmark;
	}

	/**
	 * @param landmark the landmark to set
	 */
	public void setLandmark(String landmark) {
		this.landmark = landmark;
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
	 * @return the distict
	 */
	public String getDistict() {
		return distict;
	}

	/**
	 * @param distict the distict to set
	 */
	public void setDistict(String distict) {
		this.distict = distict;
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

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Address [addessId=" + addessId + ", houseNo=" + houseNo + ", streetName=" + streetName + ", landmark="
				+ landmark + ", city=" + city + ", distict=" + distict + ", state=" + state + ", country=" + country
				+ ", zipCode=" + zipCode + "]";
	}
	
	
}
