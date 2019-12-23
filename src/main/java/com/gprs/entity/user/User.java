package com.gprs.entity.user;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import com.gprs.entity.Address;
/**
 * @author Suvvala Ramki
 */
@Entity
@Table(name="USERMSTDTL")
public class User implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -769586291179719173L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int userID;
	@Column(length = 25)
	private String firstName;
	@Column(length = 25)
	private String lastName;
	@Column(length = 25)
	private String roleGroup;
	@Column(length = 25)
	private String password;
	@Column(unique = true,length = 12)
	private String mobileNumber;
	@Column(unique = true ,length = 25)
	@Id
	private String emailID;
	@Column(length=20)
	private String userName;
	@Lob
	private byte[] profilePic;
	
	private Collection<Address> address;
	
	/**
	 * @return the userName
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName the userName to set
	 */
	public void setUserName(String userName) {
		this.userName = userName;
	}
	/**
	 * @return the profilePic
	 */
	public byte[] getProfilePic() {
		return profilePic;
	}
	/**
	 * @param profilePic the profilePic to set
	 */
	public void setProfilePic(byte[] profilePic) {
		this.profilePic = profilePic;
	}
	/**
	 * @return the userID
	 */
	public int getUserID() {
		return userID;
	}
	/**
	 * @param userID the userID to set
	 */
	public void setUserID(int userID) {
		this.userID = userID;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the roleGroup
	 */
	public String getRoleGroup() {
		return roleGroup;
	}
	/**
	 * @param roleGroup the roleGroup to set
	 */
	public void setRoleGroup(String roleGroup) {
		this.roleGroup = roleGroup;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the emailID
	 */
	public String getEmailID() {
		return emailID;
	}
	/**
	 * @param emailID the emailID to set
	 */
	public void setEmailID(String emailID) {
		this.emailID = emailID;
	}
	/**
	 * @return the address
	 */
	public Collection<Address> getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "User [userID=" + userID + ", firstName=" + firstName + ", lastName=" + lastName + ", roleGroup="
				+ roleGroup + ", password=" + password + ", mobileNumber=" + mobileNumber + ", emailID=" + emailID
				+ ", userName=" + userName + ", profilePic=" + Arrays.toString(profilePic) + ", address=" + address
				+ "]";
	}	
}
