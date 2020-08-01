package project;

public class LoanPayment {

	private String applicantName;
	private LoanDetails loanType;
	private int paymentMonths;
	private int totalPaymentAmount;
	private String status;

	public String getApplicantName() {
		return applicantName;
	}

	public void setApplicantName(String applicantName) {
		this.applicantName = applicantName;
	}

	public int getPaymentMonths() {
		return paymentMonths;
	}

	public LoanDetails getLoanType() {
		return loanType;
	}

	public void setLoanType(LoanDetails loanType) {
		this.loanType = loanType;
	}

	public void setPaymentMonths(int paymentMonths) {
		this.paymentMonths = paymentMonths;
	}

	public int getTotalPaymentAmount() {
		return totalPaymentAmount;
	}

	public void setTotalPaymentAmount(int totalPaymentAmount) {
		this.totalPaymentAmount = totalPaymentAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}
