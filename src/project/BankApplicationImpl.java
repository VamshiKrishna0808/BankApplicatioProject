package project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class BankApplicationImpl extends Utils implements BankApplication {

	public void loanProcess() {
		
		List<String> list = new ArrayList<String>();
		Map<String, List<LoanDetails>> bankloanDetails = loanInformation;

		Set mapSet = bankloanDetails.entrySet();
		Iterator mapSetiter = mapSet.iterator();

		while (null != mapSetiter && mapSetiter.hasNext()) {

			Map.Entry entry = (Map.Entry) mapSetiter.next();

			List<LoanDetails> loan = (List<LoanDetails>) entry.getValue();

			System.out.println();

			System.out.println("Bank Name" + "  :  " + entry.getKey());

			for (LoanDetails loanInfo : loan) {

				System.out.println(
						" Loan Type" + " : " + loanInfo.getLoanType() + " " + " Intrest" + " " + loanInfo.getIntrest());

				list.add((String) loanInfo.getLoanType());

			}

			for (String list1 : list) {

				System.out.println("Loan Details List" + " " + list1.valueOf(list1));

			}

		}

	}

	public void applicationList() {

		Map<String, List<ApplicantDetail>> applicantDetail = Utils.applicantDetail;

		// List<ApplicantDetail> application = new ArrayList<>();

		// ApplicantDetail list = new ApplicantDetail();

		Set mapSet = applicantDetail.entrySet();// Step 1
		Iterator mapSetiter = mapSet.iterator();// Step 2
		while (mapSetiter.hasNext()) {
			Map.Entry entry = (Map.Entry) mapSetiter.next();

			System.out.println("Bank Name" + " : " + entry.getKey());
			System.out.println();
			List<ApplicantDetail> emp = (List<ApplicantDetail>) entry.getValue();

			for (ApplicantDetail list : emp) {

				System.out.println("Application Name" + " " + list.getApplicantName() + " " + " Application Number"
						+ list.getApplicationNumber());
				System.out.println("Loan Type" + "  " + list.getLoanDetails().getLoanType() + " " + "Intrest Percentage"
						+ " " + list.getLoanDetails().getIntrest());

			}

		}
	}

	public void loanPayment() {

		Map<String, List<LoanPayment>> updateLoanPayments = Utils.loanPayments;
		// Map<String, List<String>> updatedList = new HashMap<>();

		Set mapSet = updateLoanPayments.entrySet();

		Iterator iter = mapSet.iterator();

		while ((iter.hasNext()) && (iter != null)) {

			Map.Entry entry = (Map.Entry) iter.next();

			System.out.println("Bank Name" + "  :  " + entry.getKey());

			List<LoanPayment> laonPayment = (List<LoanPayment>) entry.getValue();

			for (LoanPayment loanPay : laonPayment) {

				if (loanPay.getPaymentMonths() == 50 || loanPay.getPaymentMonths() > 50) {

					loanPay.setStatus("inactive");

				}
				System.out.println("updated LoanPaymentDetails");

				System.out.println("LoanPaymentDetails");
				System.out.println("ApplicantName" + "  " + loanPay.getApplicantName());
				System.out.println("LoanType" + "  " + loanPay.getLoanType().getLoanType());
				System.out.println("paymentMonths" + " " + loanPay.getPaymentMonths());
				System.out.println("totalPaymentAmount" + " " + loanPay.getTotalPaymentAmount());
				System.out.println("status" + " " + loanPay.getStatus());

			}

		}

	}

	public void archive() {

		Map<String, List<LoanPayment>> updateLoanPayments = Utils.loanPayments;
		List<String> listName = new ArrayList<>();

		Set mapSet = updateLoanPayments.entrySet();

		Iterator iter = mapSet.iterator();

		while ((iter.hasNext()) && (iter != null)) {

			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println("Bank Name" + "  :  " + entry.getKey());

			List<LoanPayment> laonPayment = (List<LoanPayment>) entry.getValue();

			for (LoanPayment loanPay : laonPayment) {

				System.out.println("LoanPaymentDetails");
				System.out.println("ApplicantName" + "  " + loanPay.getApplicantName());
				System.out.println("LoanType" + "  " + loanPay.getLoanType().getLoanType());
				System.out.println("paymentMonths" + " " + loanPay.getPaymentMonths());
				System.out.println("totalPaymentAmount" + " " + loanPay.getTotalPaymentAmount());
				System.out.println("status" + " " + loanPay.getStatus());

				if ((loanPay.getStatus()) == "active") {

					listName.add(loanPay.getApplicantName());

				}

			}

			System.out.println(" Bank Name" + entry.getKey());

			System.out.println("-----------------");
			for (String list1 : listName) {

				System.out.println("Loan Details List" + " " + list1.valueOf(list1));

			}
		}

	}

	public void update() {

		Map<String, List<LoanPayment>> updateLoanPayments = Utils.loanPayments;
		List<String> listName = new ArrayList<>();

		Set mapSet = updateLoanPayments.entrySet();

		Iterator iter = mapSet.iterator();

		while ((iter.hasNext()) && (iter != null)) {

			Map.Entry entry = (Map.Entry) iter.next();
			System.out.println("Bank Name" + "  :  " + entry.getKey());

			List<LoanPayment> laonPayment = (List<LoanPayment>) entry.getValue();

			for (LoanPayment loanPay : laonPayment) {

				System.out.println("LoanPaymentDetails");
				System.out.println("ApplicantName" + "  " + loanPay.getApplicantName());
				System.out.println("LoanType" + "  " + loanPay.getLoanType().getLoanType());
				System.out.println("paymentMonths" + " " + loanPay.getPaymentMonths());
				System.out.println("totalPaymentAmount" + " " + loanPay.getTotalPaymentAmount());
				System.out.println("status" + " " + loanPay.getStatus());

				// loanPay.getTotalPaymentAmount())>35
				if ((loanPay.getPaymentMonths()) >= 10) {

					listName.add(loanPay.getApplicantName());

				}

			}

			System.out.println(" Bank Name" + entry.getKey());

			System.out.println("-----------------");
			for (String list1 : listName) {

				System.out.println("Loan Details List" + " " + list1.valueOf(list1));

			}
		}

	}

}
