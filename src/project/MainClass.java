package project;

public class MainClass extends BankApplicationImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass main = new MainClass();//database
		try {

			
			main.loanProcess();
			main.loanPayment();
			  main.archive();
			  main.update();
			  main.applicationList();	 
		}

		catch (Exception e) {
			e.getStackTrace();
		}
		finally {
			System.out.println("finally");

		}
	}

}
