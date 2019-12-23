package com.gprs.entity.user;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.gprs.entity.Address;


@Entity
@Table(name="AGTSLRMST")
public class AgentSeller implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String agentId;
	
	private String agentName;
	@ManyToMany
	private List<Address> address;
	
	private String agentCertificate;
	
	private Date certificateEndDate;
	
	private Date CertificationDate;
	
	private Date renewalDate;

	/**
	 * @return the agentId
	 */
	public String getAgentId() {
		return agentId;
	}

	/**
	 * @param agentId the agentId to set
	 */
	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	/**
	 * @return the agentName
	 */
	public String getAgentName() {
		return agentName;
	}

	/**
	 * @param agentName the agentName to set
	 */
	public void setAgentName(String agentName) {
		this.agentName = agentName;
	}



	/**
	 * @return the address
	 */
	public List<Address> getAddress() {
		return address;
	}

	/**
	 * @param address the address to set
	 */
	public void setAddress(List<Address> address) {
		this.address = address;
	}

	/**
	 * @return the agentCertificate
	 */
	public String getAgentCertificate() {
		return agentCertificate;
	}

	/**
	 * @param agentCertificate the agentCertificate to set
	 */
	public void setAgentCertificate(String agentCertificate) {
		this.agentCertificate = agentCertificate;
	}

	/**
	 * @return the certificateEndDate
	 */
	public Date getCertificateEndDate() {
		return certificateEndDate;
	}

	/**
	 * @param certificateEndDate the certificateEndDate to set
	 */
	public void setCertificateEndDate(Date certificateEndDate) {
		this.certificateEndDate = certificateEndDate;
	}

	/**
	 * @return the certificationDate
	 */
	public Date getCertificationDate() {
		return CertificationDate;
	}

	/**
	 * @param certificationDate the certificationDate to set
	 */
	public void setCertificationDate(Date certificationDate) {
		CertificationDate = certificationDate;
	}

	/**
	 * @return the renewalDate
	 */
	public Date getRenewalDate() {
		return renewalDate;
	}

	/**
	 * @param renewalDate the renewalDate to set
	 */
	public void setRenewalDate(Date renewalDate) {
		this.renewalDate = renewalDate;
	}
	
	
	

}
