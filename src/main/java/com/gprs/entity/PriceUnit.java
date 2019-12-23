package com.gprs.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "PRICEUNIT")
public class PriceUnit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4020924807422612523L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int priceUnitID;

	@Column(length= 4)
	private String priceUnit;
	@Column(length= 4)
	private String convertUnit;
	private double conversionRate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdated;

	private String lastUpdatedBy;
	@Temporal(TemporalType.DATE)
	private Date endDate;
	@Temporal(TemporalType.DATE)
	private Date startDate;

	private String country;

	

	/**
	 * @return the priceUnitID
	 */
	public int getPriceUnitID() {
		return priceUnitID;
	}

	/**
	 * @param priceUnitID the priceUnitID to set
	 */
	public void setPriceUnitID(int priceUnitID) {
		this.priceUnitID = priceUnitID;
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
	 * @return the conversionRate
	 */
	public double getConversionRate() {
		return conversionRate;
	}

	/**
	 * @param conversionRate the conversionRate to set
	 */
	public void setConversionRate(double conversionRate) {
		this.conversionRate = conversionRate;
	}

	/**
	 * @return the priceUnit
	 */
	public String getPriceUnit() {
		return priceUnit;
	}

	/**
	 * @param priceUnit the priceUnit to set
	 */
	public void setPriceUnit(String priceUnit) {
		this.priceUnit = priceUnit;
	}

	/**
	 * @return the convertUnit
	 */
	public String getConvertUnit() {
		return convertUnit;
	}

	/**
	 * @param convertUnit the convertUnit to set
	 */
	public void setConvertUnit(String convertUnit) {
		this.convertUnit = convertUnit;
	}

	/**
	 * @return the lastUpdated
	 */
	public Date getLastUpdated() {
		return lastUpdated;
	}

	/**
	 * @param lastUpdated the lastUpdated to set
	 */
	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	/**
	 * @return the lastUpdatedBy
	 */
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}

	/**
	 * @param lastUpdatedBy the lastUpdatedBy to set
	 */
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}

	/**
	 * @return the endDate
	 */
	public Date getEndDate() {
		return endDate;
	}

	/**
	 * @param endDate the endDate to set
	 */
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	/**
	 * @return the startDate
	 */
	public Date getStartDate() {
		return startDate;
	}

	/**
	 * @param startDate the startDate to set
	 */
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

}
