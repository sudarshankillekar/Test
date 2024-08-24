package com.ui.pojo;

public class GlobalDetailsPojo {
  
	private String oem;
	private String jobNumber;
	private String imeiserialno;
	private String Product;
	private String Model;
	private String WarrantyStatus;
	private String actionStatus;
	
	public GlobalDetailsPojo(String oem, String jobNumber, String imeiserialno, String product, String model,
			String warrantyStatus, String actionStatus) {
		super();
		this.oem = oem;
		this.jobNumber = jobNumber;
		this.imeiserialno = imeiserialno;
		Product = product;
		Model = model;
		WarrantyStatus = warrantyStatus;
		this.actionStatus = actionStatus;
	}

	public String getOem() {
		return oem;
	}

	public void setOem(String oem) {
		this.oem = oem;
	}

	public String getJobNumber() {
		return jobNumber;
	}

	public void setJobNumber(String jobNumber) {
		this.jobNumber = jobNumber;
	}

	public String getImeiserialno() {
		return imeiserialno;
	}

	public void setImeiserialno(String imeiserialno) {
		this.imeiserialno = imeiserialno;
	}

	public String getProduct() {
		return Product;
	}

	public void setProduct(String product) {
		Product = product;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getWarrantyStatus() {
		return WarrantyStatus;
	}

	public void setWarrantyStatus(String warrantyStatus) {
		WarrantyStatus = warrantyStatus;
	}

	public String getActionStatus() {
		return actionStatus;
	}

	public void setActionStatus(String actionStatus) {
		this.actionStatus = actionStatus;
	}

	@Override
	public String toString() {
		return "GlobalDetailsPojo [oem=" + oem + ", jobNumber=" + jobNumber + ", imeiserialno=" + imeiserialno
				+ ", Product=" + Product + ", Model=" + Model + ", WarrantyStatus=" + WarrantyStatus + ", actionStatus="
				+ actionStatus + "]";
	}
	
	
	
	
}
