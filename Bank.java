package edu.svit.sf04.Bank;

public class Bank {
	
	private String bankName;
	private String IFSCCODE;
	private String location;
	/**
	 */
	public Bank() {
		this.bankName = bankName;
		this.IFSCCODE = IFSCCODE;
		this.location = location;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public String getIFSCCODE() {
		return IFSCCODE;
	}
	public void setIFSCCODE(String iFSCCODE) {
		IFSCCODE = iFSCCODE;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", IFSCCODE=" + IFSCCODE + ", location=" + location + "]";
	}
	

}
