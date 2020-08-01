package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//load process
public class Utils {
	public static Map<String, List<LoanDetails>> loanInformation;
	public static Map<String, List<ApplicantDetail>> applicantDetail;
	public static Map<String, List<LoanPayment>> loanPayments;

	public static void loadloanDetail() {

		System.out.println("Bank Information");
		loanInformation = new HashMap<>();

		List<LoanDetails> loandetail = new ArrayList<>();

		LoanDetails loanDetails = new LoanDetails();

		loanDetails.setLoanType("personal");

		loanDetails.setIntrest(6);

		loandetail.add(loanDetails);

		loanDetails = new LoanDetails();

		loanDetails.setLoanType("student");

		loanDetails.setIntrest(9);

		loandetail.add(loanDetails);

		loanDetails = new LoanDetails();

		loanDetails.setLoanType("housing");

		loanDetails.setIntrest(8);

		loandetail.add(loanDetails);

		loanInformation.put("hdfc", loandetail);

	}

	public static void applicantDetail() {

		applicantDetail = new HashMap<>();
		List<ApplicantDetail> applicationdetail = new ArrayList<>();
		ApplicantDetail applicationList = new ApplicantDetail();

		applicationList.setApplicantName("Vamshi");

		applicationList.setApplicationNumber(123456);

		LoanDetails loan = new LoanDetails();
		loan.setLoanType("personal");
		loan.setIntrest(6);
		applicationList.setLoanDetails(loan);

		applicationdetail.add(applicationList);

		applicationList = new ApplicantDetail();

		applicationList.setApplicantName("krishna");

		applicationList.setApplicationNumber(987654);

		loan = new LoanDetails();
		loan.setLoanType("student");
		loan.setIntrest(9);
		applicationList.setLoanDetails(loan);

		applicationdetail.add(applicationList);

		applicationList = new ApplicantDetail();

		applicationList.setApplicantName("rayarao");

		applicationList.setApplicationNumber(9854);

		loan = new LoanDetails();
		loan.setLoanType("housing");
		loan.setIntrest(12);
		applicationList.setLoanDetails(loan);

		applicationdetail.add(applicationList);

		applicantDetail.put("hdfc", applicationdetail);

	}

	public static void loanPayments() {

		loanPayments = new HashMap<>();

		List<LoanPayment> loanPayment = new ArrayList<>();

		LoanPayment loanpay = new LoanPayment();

		loanpay.setApplicantName("vamshi");
		LoanDetails loandetail = new LoanDetails();
		loandetail.setLoanType("personal");

		loanpay.setLoanType(loandetail);
		loanpay.setPaymentMonths(5);
		loanpay.setTotalPaymentAmount(1234);
		loanpay.setStatus("active");

		loanPayment.add(loanpay);

		loanpay = new LoanPayment();

		loanpay.setApplicantName("krishna");
		loandetail = new LoanDetails();
		loandetail.setLoanType("student");

		loanpay.setLoanType(loandetail);
		loanpay.setPaymentMonths(46);
		loanpay.setTotalPaymentAmount(1234);
		loanpay.setStatus("active");

		loanPayment.add(loanpay);

		loanpay = new LoanPayment();

		loanpay.setApplicantName("rayarao");
		loandetail = new LoanDetails();
		loandetail.setLoanType("housing");
		loanpay.setLoanType(loandetail);
		loanpay.setPaymentMonths(50);
		loanpay.setTotalPaymentAmount(1234);
		loanpay.setStatus("inactive");

		loanPayment.add(loanpay);

		loanPayments.put("hdfc", loanPayment);

	}

	static {

		Utils.loadloanDetail();
		Utils.applicantDetail();
		Utils.loanPayments();

	}

}
