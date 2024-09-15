package com.ui.pojo;

import com.github.javafaker.Name;
import com.github.javafaker.PhoneNumber;

public class CreateJobPojo {

	private String IMEI_Numbe1 ;
	private String Remarks ;
	private String FirstName ;
	private String LastName ;
	private String ContactNo;
	private String AlternateContactNo ;
	private String OEM_NAME;
	private String AlternateEmailId ;
	private String Flat_Society_No ;
	private String ApartmentName ;
	private String Landmark ;
	private String StreetName ;
	private String Area ;
	private String	Pincode ;


	public String getOEM_NAME() {
		return OEM_NAME;
	}
	public void setOEM_NAME(String oEM_NAME) {
		OEM_NAME = oEM_NAME;
	}
	public CreateJobPojo(String iMEI_Numbe1, String remarks, String firstName, String lastName, String contactNo,
			String alternateContactNo, String oEM_NAME, String alternateEmailId, String flat_Society_No,
			String apartmentName, String landmark, String streetName, String area, String pincode) {
		super();
		IMEI_Numbe1 = iMEI_Numbe1;
		Remarks = remarks;
		FirstName = firstName;
		LastName = lastName;
		ContactNo = contactNo;
		AlternateContactNo = alternateContactNo;
		OEM_NAME = oEM_NAME;
		AlternateEmailId = alternateEmailId;
		Flat_Society_No = flat_Society_No;
		ApartmentName = apartmentName;
		Landmark = landmark;
		StreetName = streetName;
		Area = area;
		Pincode = pincode;
	}
	public String getIMEI_Numbe1() {
		return IMEI_Numbe1;
	}
	public void setIMEI_Numbe1(String iMEI_Numbe1) {
		IMEI_Numbe1 = iMEI_Numbe1;
	}
	public String getRemarks() {
		return Remarks;
	}
	public void setRemarks(String remarks) {
		Remarks = remarks;
	}
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public String getAlternateContactNo() {
		return AlternateContactNo;
	}
	public void setAlternateContactNo(String alternateContactNo) {
		AlternateContactNo = alternateContactNo;
	}
//	public String getEmailId() {
//		return EmailId;
//	}
//	public void setEmailId(String emailId) {
//		EmailId = emailId;
//	}
	public String getAlternateEmailId() {
		return AlternateEmailId;
	}
	public void setAlternateEmailId(String alternateEmailId) {
		AlternateEmailId = alternateEmailId;
	}
	public String getFlat_Society_No() {
		return Flat_Society_No;
	}
	public void setFlat_Society_No(String flat_Society_No) {
		Flat_Society_No = flat_Society_No;
	}
	public String getApartmentName() {
		return ApartmentName;
	}
	public void setApartmentName(String apartmentName) {
		ApartmentName = apartmentName;
	}
	public String getLandmark() {
		return Landmark;
	}
	public void setLandmark(String landmark) {
		Landmark = landmark;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public String getArea() {
		return Area;
	}
	public void setArea(String area) {
		Area = area;
	}
	public String getPincode() {
		return Pincode;
	}
	public void setPincode(String pincode) {
		Pincode = pincode;
	}
	
	
	
}
