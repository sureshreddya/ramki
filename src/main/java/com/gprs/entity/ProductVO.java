package com.gprs.entity;

import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

@Component
public class ProductVO {

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

	private List<MultipartFile> images;
	
	private long totalSaledPieces;

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
