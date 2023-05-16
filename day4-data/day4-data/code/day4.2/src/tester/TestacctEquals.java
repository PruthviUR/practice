package tester;
import banking.BankAccount;
public class TestacctEquals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
BankAccount acct1=new BankAccount(101,"Rama Mathur","Saving",12000);
BankAccount acct2=new BankAccount(102,"Rama Mathur","Saving",12000);
System.out.println(acct1=acct2);//f
System.out.println(acct1.equals(acct2));
Object o=100;
System.out.println(o.getClass());
System.out.println(acct1.equals(o));

	}

}
