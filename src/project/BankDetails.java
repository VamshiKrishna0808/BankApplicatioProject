package project;

import java.util.Map;

public class BankDetails {

	
	private String bankName;
	private Map<String,LoanDetails> loanDetails;
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public Map<String, LoanDetails> getLoanDetails() {
		return loanDetails;
	}
	public void setLoanDetails(Map<String, LoanDetails> loanDetails) {
		this.loanDetails = loanDetails;
	}
}
