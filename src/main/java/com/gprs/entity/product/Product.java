package com.gprs.entity.product;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.springframework.web.multipart.MultipartFile;

import com.gprs.entity.user.AgentSeller;

@Entity
@Table(name="PRDMSTDTL")
public class Product implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String prouctId;
	
	private String productName;
	
	private String manufacturer;
	
	private String productType;
	
	private String category;
	
	private String 	modelNumber;
	
	private String serialNumber;
	
	private double price;
	
	private String priceUnit;
	
	private String availablePieces;
	@Transient
	private List<MultipartFile> images;
	
	private long totalSaledPieces;
	@ManyToMany
	private List<AgentSeller> agentSeller ;
	/**
	 * @param agentSeller the agentSeller to set
	 */
	public void setAgentSeller(List<AgentSeller> agentSeller) {
		this.agentSeller = agentSeller;
	}
	/**
	 * @return the images
	 */
	public List<MultipartFile> getImages() {
		return images;
	}
	/**
	 * @param images the images to set
	 */
	public void setImages(List<MultipartFile> images) {
		this.images = images;
	}
	/**
	 * @return the agentSeller
	 */
	public List<AgentSeller> getAgentSeller() {
		return agentSeller;
	}
	/**
	 * @return the prouctId
	 */
	public String getProuctId() {
		return prouctId;
	}
	/**
	 * @param prouctId the prouctId to set
	 */
	public void setProuctId(String prouctId) {
		this.prouctId = prouctId;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the manufacturer
	 */
	public String getManufacturer() {
		return manufacturer;
	}
	/**
	 * @param manufacturer the manufacturer to set
	 */
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}
	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}
	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}
	/**
	 * @return the modelNumber
	 */
	public String getModelNumber() {
		return modelNumber;
	}
	/**
	 * @param modelNumber the modelNumber to set
	 */
	public void setModelNumber(String modelNumber) {
		this.modelNumber = modelNumber;
	}
	/**
	 * @return the serialNumber
	 */
	public String getSerialNumber() {
		return serialNumber;
	}
	/**
	 * @param serialNumber the serialNumber to set
	 */
	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}
	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}
	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
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
	 * @return the availablePieces
	 */
	public String getAvailablePieces() {
		return availablePieces;
	}
	/**
	 * @param availablePieces the availablePieces to set
	 */
	public void setAvailablePieces(String availablePieces) {
		this.availablePieces = availablePieces;
	}
	/**
	 * @return the totalSaledPieces
	 */
	public long getTotalSaledPieces() {
		return totalSaledPieces;
	}
	/**
	 * @param totalSaledPieces the totalSaledPieces to set
	 */
	public void setTotalSaledPieces(long totalSaledPieces) {
		this.totalSaledPieces = totalSaledPieces;
	}	
}
